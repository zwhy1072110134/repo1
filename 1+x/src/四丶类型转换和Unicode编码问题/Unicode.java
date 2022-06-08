package 四丶类型转换和Unicode编码问题;

import java.util.Scanner;

/*数据类型转换：
             1.自动转换
                  范围小的可以自动转换（赋值给）为范围大的类型
                      整数：byte < short < int < long
                      小数：float < double
                  范围小的类型【遇到】范围大的类型，则自动转换为范围大的类型
                      int a = 10 + 3.14;   想这样，右边整体就变成了double类型
                  整数<小数   最大的是字符串     可以理解为：任何类型遇到字符串，自动转为字符串
                  char < int
                      java用的是Unicode编码   （unicode兼容于ascii（ascii码表只有127个，而Unicode中有很多值，前127个就对应ascii码表））
             2.强制转换
                  如果将范围大的赋值给范围小的，就必须进行强制类型转换
                  通用写法：
                         范围小 = （小类型）范围大;
                  特殊写法（单单只能适用于float类型）：
                         float x = 123.456f;
 */
public class Unicode {
    public static void main(String[] args) {
        //float = int
        float myNumber = 10;
        //float < double
        double d = 3.14f;

        //进一步理解例题
        System.out.println(""+10+1);//101    "任何值遇到字符串都会自动转换为字符串类型，所以前面两项先拼接得到'10',但这个’10‘是字符串类型，后面一次运算同理，所以最后得到的‘101’也是字符串类型"
        System.out.println(10+""+1);//101
        System.out.println(10+1+"");//11

        Scanner input =new Scanner(System.in);
        System.out.println("请输入java成绩：");
        int javaScore = input.nextInt();
        System.out.println("请输入sql成绩：");
        int sqlScore = input.nextInt();
        System.out.println("请输入html成绩：");
        int htmlScore = input.nextInt();
        int between = javaScore - sqlScore;
        System.out.println("java比sql多：" + between);
        double avgScore = (javaScore + sqlScore + htmlScore)/3.0;//这里使原本的整数类型遇到了小数类型，所以最后的结果要自动转换成范围更大的小数类型
        System.out.println("三门课的平均成绩是：" + avgScore);

        //实验char和int类型之间的关系
        System.out.println("****************************");
        char ch = 'A';
        System.out.println(ch);      //A
        System.out.println(ch + 0);  //65    这里的原理就是范围比较小的char类型遇到范伟比较大的int类型时会自动转换为范围比较大的int类型


        //强制类型转换部分
        System.out.println("****************************");
        float f1 = 123.456f;
        int myNum2 = (int)f1;

        float f3 = (float)123.4;
        float f4 = 123.4f;

        //实例部分
        System.out.println("****************************");
        //1.已知圆的半径radius = 1.5,，求面积
        double radius = 1.5;
        double pi = 3.14159265358;
        double area = pi * radius * radius;
        System.out.println(area);
        //2.apple电脑市场份额20，今年增加了9.8%，求今年的份额；
        int fenE = 20;
        double jinNianFenE = fenE * (1+9.8/100);
        System.out.println(jinNianFenE);
    }
}
