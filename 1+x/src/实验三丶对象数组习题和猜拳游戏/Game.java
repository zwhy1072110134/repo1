package 实验三丶对象数组习题和猜拳游戏;

import java.util.Scanner;

/*
* 猜拳游戏：
*        1.先在控制台上进行登录
*        2.在对方角色中选一个对手：1、张三 2、李四 3、王五
*        3.介绍猜拳的规则： 1剪刀  2石头  3布
*        4.你选择一个进行猜拳
*        5.计算机随机产生一个
*        6.将你与计算机进行“比较”
*        7.询问是否继续
*        8.结束后，按照结果输出是赢了还是输了，在比赛中的过程中，一共玩了几局，输了几局
* */
public class Game {
    User user ;
    Computer computer ;
    int count ;

    //初始化：设置自己的名字，对手的名字，设置初始积分为0
    public void init(){
        System.out.println("请输入您的姓名：");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        user = new User();
        User.name = name;
        User.score = 0;

        System.out.println("请选择你的对手： \n 1.张三 \t 2.李四 \t 3.王五");
        int choice = input.nextInt();
        computer = new Computer();
        Computer.score = 0;
        //NullPointerException空指针异常，当  变量.属性   对象.方法（） 时，前面的值是null时就会报空指针异常
        switch (choice){
            case 1:
                computer.name = "张三";
                break;
            case 2:
                computer.name = "李四";
                break;
            case 3:
                computer.name = "王五";
                break;
            default:
                System.out.println("输入有误");
        }
        System.out.println("您所挑选的选手是：" + computer.name);
    }
    public void start(){
        init();
        String isContinue = null;
        Scanner input = new Scanner(System.in);
        do {
            int UserFist = User.showFist();
            int ComputerFist = Computer.showFist();
            calcResult(UserFist,ComputerFist);
            System.out.println("是否继续：y(继续)/其他(终止)");
            isContinue = input.next();
        }while ("y".equals(isContinue));

        showResult(user,computer);
    }

    private void calcResult(int userFist, int computerFist) {
        if ((userFist == 1 && computerFist == 3)||(userFist == 2 && computerFist == 1)||(userFist == 3 && computerFist == 2)){
            System.out.println("你赢了");
            User.score ++ ;
        }else if ((userFist == 3 && computerFist == 1)||(userFist == 1 && computerFist == 2)||(userFist == 2 && computerFist == 3)){
            System.out.println("你输了");
        }else if ((userFist == computerFist )||(userFist == computerFist)||(userFist == computerFist)){
            System.out.println("平局");
        }
    }
    public void showResult(User user,Computer computer) {
        System.out.println(User.name + "\t" + User.score);
        System.out.println(Computer.name + "\t" + Computer.score);
        if (User.score > Computer.score) {
            System.out.println("恭喜，获得最后的胜利");
        } else if (User.score < Computer.score) {
            System.out.println("很遗憾，输了");
        } else
            System.out.println("最终是平局。。。");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
