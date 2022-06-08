package 五丶算数运算符和习题;

import java.util.Scanner;

/*
* 算数运算符   +   -   *   /   %
* 关系运算符（比较运算符）：>   <  >=   <=   ==   !=                 关系运算符的比较结果就是boolean类型
*                     字符串比较相等不能用==，相等equals(),不相等！equals()
*
*    3>=2    读作：3大于2或3等于2   所以为真  true
* */
public class arithmeticOperator {
    public static void main(String[] args) {
        //例1.46天，包含了几周零几天
        int week = 46 / 7;
        int day = 46 % 7;
        System.out.println("46天，包含了" + week + "周零" + day + "天");
        System.out.println("****************************");
        //例2.商场活动100当做120花，如果现在买了总价为420元的商品，那么请问实付多少钱
        int money = (420 / 120)*100 + 420 % 120;
        System.out.println(money);
        System.out.println("****************************");
        //例3.输入张三的成绩，与李四的成绩（80）进行比较，输出张三是否比李四高
        Scanner input = new Scanner(System.in);
        System.out.println("请输入张三的成绩：");
        int zsScore = input.nextInt();
        System.out.println(zsScore > 80);
        System.out.println("****************************");
        //例4.输入一个五位数，求各个位数之和
        int num = 12345;
        int geWei   =num/1    %10;//12345-->5
        int shiWei  =num/10   %10;//12345-->1234-->4
        int baiWei  =num/100  %10;//12345-->123-->3
        int qianWei =num/1000 %10;//12345-->12-->2
        int wanWei  =num/10000%10;//12345-->1
        System.out.println(geWei + shiWei + baiWei + qianWei + wanWei);
        System.out.println("****************************");
        //例5.两个数交换位置
        int num1 = 10;
        int num2 = 20;
        System.out.println("交换前num1：" + num1);
        System.out.println("交换前num2：" + num2);
        //通过中间变量实现
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("交换后num1：" + num1);
        System.out.println("交换后num2：" + num2);
        System.out.println("****************************");
        int max = Integer.MAX_VALUE;//int最大值
        int min = Integer.MIN_VALUE;//int最小值
        System.out.println(max);
        System.out.println(min);
        //此处最大值加一变成最小值，最小值减一变成最大值
    }
}
