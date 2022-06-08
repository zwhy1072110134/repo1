package 三丶变量应用;

import java.util.Scanner;

/*
   * java可以直接表示的进制   二进制     0b数字
   *                      八进制     0数字
   *                      十进制（默认）
   *                      十六进制   0x数字
   * 不论在定义时用的是多少进制，最后在输出的时候输出的都是十进制的结果
   *
   * 变量命名规则（强制性）：
   *           首字母 + 其他部分
   *           myFirstNum = m +yFirstNum
   *
   *           a.首字母、各国语言、下划线、钱
   *           b.其他：首字母 + 数字
   *           c.不能是关键字
   * 变量的范围是最近的一对大括号
   *
   *   +号的两种用法，  加法  拼接
   *
   * 自动导包问题：
   *          开启：file-->settiings-->Editor-->general-->auto import
   *          注意：如果没有自动导入，可能原因就是该类 在当前环境中存在重名。需要手工导入：alt + enter
   * java中的默认包：java中的默认包就是java.lang,即该包中的所有类会自动导入，因此不必再写import......
   *
   * */
public class VariableApplication {
    public static void main(String[] args) {
        int a1 = 33;
        System.out.println(a1);                  //33
        int a2 = 0b01111;
        System.out.println(a2);                  //15
        int a3 = 001111;
        System.out.println(a3);                  //585
        int a4 = 0x01111;
        System.out.println(a4);                  //4369
        System.out.println("__________________________________");     //例一
        String pinPai = "iphone";
        double chiCun = 4.0;
        String xiangSu = "1080px*768px";
        int jiaGe = 5288;
        System.out.println("品牌：" + pinPai);
        System.out.println("尺寸：" + chiCun);
        System.out.println("像素：" + xiangSu);
        System.out.println("价格：" + jiaGe);
        System.out.println("__________________________________");
        //例二：从控制台输入王浩的三门课程成绩，计算：1.java课程和sql课程分数之差  2.三门课平均成绩
        //从控制台输入：Scanner(Scanner属于jdk类库，需要手工引入才能使用)
        //Scanner中有很多类型的输入方法，但是没有接受char的方法
        Scanner input =new Scanner(System.in);
        //input.nextXxx():接收各种类型（除了char）
        /*
        接收字符串  next()、nextLine()
        String name = input.next();
        String name = input.nextLine();
        Scanner input = new Scanner(System.in);
                  next()、nextLine()的区别在于：
                       next()       不接收空格和回车，并且将空格、回车当做终止符
                       nextLine()    接收空格和回车
        */
        System.out.println("请输入java成绩：");
        int javaScore = input.nextInt();
        System.out.println("请输入sql成绩：");
        int sqlScore = input.nextInt();
        System.out.println("请输入html成绩：");
        int htmlScore = input.nextInt();
        int between = javaScore - sqlScore;
        System.out.println("java比sql多：" + between);
        double avgScore = (javaScore + sqlScore + htmlScore)/3;
        System.out.println("三门课的平均成绩是：" + avgScore);
    }
}
