package 实验四丶图书管理系统;


import java.awt.print.Book;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class bookManager {
    private book[] books;
    private Scanner input = new Scanner(System.in);
    //初始化方法：图书馆成立的时候，预先给里面增加一些书（图书馆最多能放10本书，成立时放3本）
    public void init() {
        books = new book[10];//此时的默认值是null、null、null、null、null...

        book book0 = new book();
        book0.setId(1000);
        book0.setName("tijava");
        book0.setState(1);//在库
        //book0.setBorrowDate(null);
        //book0.setBorrowCount(0);

        book book1 = new book();
        book1.setId(1001);
        book1.setName("高并发");
        book1.setState(1);//在库

        book book2 = new book();
        book2.setId(1002);
        book2.setName("分布式");
        book2.setState(1);//在库

        books[0] = book0;
        books[1] = book1;
        books[2] = book2;

    }

        //菜单
    public void menu(){
        System.out.println("==========欢迎进入图书管理系统==========");
        System.out.println("1.增加图书");
        System.out.println("2.删除图书");
        System.out.println("3.借阅图书");
        System.out.println("4.归还图书");
        System.out.println("5.图书风云榜");
        System.out.println("6.查看图书");
        System.out.println("请根据提示选择：");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                addBook();
                break;
            case 2:
                deleteBook();
                break;
            case 3:
                borrowBook();
                break;
            case 4:
                returnBook();
                break;
            case 5:
                BookRank();
                break;
            case 6:
                showBooks();
                break;
            default:
                System.out.println("请根据选项来进行选择，没有您所选择的选项");
        }
    }

    public void isContinueMenu(){
        System.out.println("是否回到主菜单进行其他操作(y/其他)");
        String isContinue = input.next();
        if ("y".equals(isContinue)){
            menu();//递归调用
        }
    }

    private void addBook(){
        System.out.println("增加图书......");

        book book = new book();

        System.out.println("请输入书的编号");
        int newbookid = input.nextInt();
        System.out.println("请输入书的名字");
        String newbookname = input.next();
        int state = 1;
        Date bDate = null;
        int bCount = 0;
        //以上仅仅是用户对数据进行输入，但是没有将数据传进去
        book.setId(newbookid);
        book.setName(newbookname);
        book.setState(1);
        //寻找增加的位置，第一个为null的位置
        int position = -1;
        for (int i = 0;i<books.length;i++){
            if (books[i] == null){
                position = i;
                break;
            }
        }
        System.out.println(position);
        books[position] = book;

        isContinueMenu();
    }
    private void deleteBook(){
        System.out.println("删除图书......");
        System.out.println("请输入想要删除的书名：");
        String deletebook = input.next();
        int position = -1;
        for (int i = 0;i<books.length;i++){
            if (books[i].getName().equals(deletebook)){
                position = i;
                //这时可以确定待删元素的位置，确定位置之后，开始考虑怎么去删除这个元素
                //关于数组中元素的删除操作就是，将后面的两个元素左移，然后将最后那个重复的元素赋值为null
                break;
            }
        }
        //删除
        int start = position + 1;
        int firstNullPosition = -1;
        for (int i=0;i<books.length;i++){
            if (books[i] == null){
                firstNullPosition = i;
                break;
            }
        }
        int end = firstNullPosition -1;

        if (firstNullPosition == -1){
            end = books.length-1;
        }

        //移动
        for (int i=start;i<=end;i++){
            books[i-1] = books[i];
        }

        books[end] = null;
        isContinueMenu();
    }
    private void borrowBook(){
        System.out.println("借阅图书......");
        System.out.println("请输入要借阅的图书：");
        String name = input.next();
        int position = -1;
        for (int i=0;i<books.length;i++){
            if (books[i].getName().equals(name)){
                position = i;
                break;
            }
        }
        books[position].setState(0);
        Date date =new Date();
        books[position].setBorrowDate(date);
        isContinueMenu();
    }
    private void returnBook(){
        System.out.println("归还图书......");
        System.out.println("请输入要归还的图书：");
        String name = input.next();
        int position = -1;
        for (int i=0;i<books.length;i++){
            if (books[i].getName().equals(name)){
                position = i;
                break;
            }
        }
        books[position].setState(1);
        books[position].setBorrowDate(null);
        int count = books[position].setBorrowCount() + 1;
        books[position].setBorrowCount(count);
        isContinueMenu();
    }
    //根据被借的次数来降序排序
    private void BookRank(){
        System.out.println("图书风云榜......");//冒泡排序

        book[] newBooks = new book[books.length];

        for (int i=0;i<books.length;i++){
            if (books[i] != null) {
                newBooks[i] = books[i];
            }
        }
        for (int i=0;i<newBooks.length-1;i++){
            for (int j=0;j<newBooks.length-1-i;j++){
                if (newBooks[j] != null && newBooks[j+1] != null){
                    if (newBooks[j].getBorrowCount() < newBooks[j+1].getBorrowCount()){
                        book temp = newBooks[j];
                        newBooks[j] = newBooks[j+1];
                        newBooks[j+1] = temp;
                    }
                }
            }
        }
        System.out.println("编号\t\t\t书名\t\t\t库存\t\t被借日期\t\t被借次数");
        //现在对输出结果进行优化，将在库情况由1/0改为中文表示，另外将被借日期进行修改，没有被借走就显示-，如果被借走，就显示具体的日期
        //因为book.getBorrowDate()返回值是一个Date类型，这里想要用一个字符串来接收它，所以在后面直接进行拼串的操作，将其转化为字符串类型输出
        for (book book:newBooks){
            if (book != null){
                String borrowDateStr = "";//book.getBorrowDate() == null ? "-" : book.getBorrowDate() + "";
                if (book.getBorrowDate() == null){
                    borrowDateStr = "-";
                }else {
                    //            borrowDateStr = book.getBorrowDate() + "";
                    Date bDate = book.getBorrowDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    borrowDateStr = sdf.format(bDate);
                }
                String StateStr = book.getState() == 1 ? "在库" : "被借";
                System.out.println(book.getId()+"\t\t"+book.getName()+"\t\t"+StateStr+"\t\t"+borrowDateStr+"\t\t\t"+book.getBorrowCount());
            }
        }
        isContinueMenu();
    }
    //现在是定义了十本书的内存空间，但是我们只定义了其中的三本书，即{x,x,x,null,null,...}的情况，当对前三个已经定义过的值进行操作时，是没有问题的，
    //但是当对后面还没有定义的值进行操作的时候，就会报空指针异常（空.对象/空.属性/空.方法）
    private void showBooks(){
        System.out.println("编号\t\t\t书名\t\t\t库存\t\t被借日期\t\t被借次数");
        //现在对输出结果进行优化，将在库情况由1/0改为中文表示，另外将被借日期进行修改，没有被借走就显示-，如果被借走，就显示具体的日期
        //因为book.getBorrowDate()返回值是一个Date类型，这里想要用一个字符串来接收它，所以在后面直接进行拼串的操作，将其转化为字符串类型输出
        for (book book:books){
            if (book != null){
                String borrowDateStr = "";//book.getBorrowDate() == null ? "-" : book.getBorrowDate() + "";
                if (book.getBorrowDate() == null){
                    borrowDateStr = "-";
                }else {
        //            borrowDateStr = book.getBorrowDate() + "";
                    Date bDate = book.getBorrowDate();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    borrowDateStr = sdf.format(bDate);
                }
                String StateStr = book.getState() == 1 ? "在库" : "被借";
                System.out.println(book.getId()+"\t\t"+book.getName()+"\t\t"+StateStr+"\t\t"+borrowDateStr+"\t\t\t"+book.getBorrowCount());
            }
        }
        isContinueMenu();
    }

}
