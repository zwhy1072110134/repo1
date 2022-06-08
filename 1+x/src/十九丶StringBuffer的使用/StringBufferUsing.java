package 十九丶StringBuffer的使用;
/*
* StringBuffer是String的加强版
*     之前讲过的，int等基本类型在对一个变量进行重新赋值的时候，是直接在原来的内存空间内对其值进行更改，
*     而String类型的的变量重新赋值时是重新开辟一块内存空间，去存储重新赋的值，而使用StringBuffer可以像基本数据类型那样直接在原来的存储空间里存储值
*
*
* String 和 StringBuffer  是相互独立的，但是两者之间可以相互转化
* */
public class StringBufferUsing {
    public static void test01(){
        StringBuffer sb = new StringBuffer("abc");
        sb.append("aaa");
        sb.insert(2,"bbb");
        sb.reverse();
        //1.sb.append()的作用相当于“+”
        //2.在StringBuffer中，左边是可以不用设置变量进行接收的

        //sb.insert(想要插入的位置,在该位置想要插入的字符)
        //sb.reverse()的作用是将字符串进行首位颠倒
        System.out.println(sb);


        //String --->  StringBuffer
        String a = "hello";
        StringBuffer sb2 = new StringBuffer(a);
        //StringBuffer --->String
        String c = sb2.toString();
    }

    //在这个方法中，传入一个字符串类型的数字，将其处理成三位数隔一个逗号并且输出
    public static void test02(String digital){
        StringBuffer sb = new StringBuffer(digital);
        for (int i=digital.length()-3;i>0;i=i-3){
            sb.insert(i,",");
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        test01();
        test02("1234567891015656");
    }
}
