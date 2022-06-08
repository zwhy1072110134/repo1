package 九丶while循环;

import java.util.Scanner;

/*
* 程序中的循环 = 循环条件 + 循环操作
* while（循环条件）
* {
*    循环语句
* }
*
* 1.while循环和if循环很像  2.循环要注意更新变量，防止死循环
*
* while和do。。。while的区别
*   while循环是先判断再决定是否执行循环体
*   do...while是先执行循环语句再进行判断，所以do..。while语句至少被执行一次
* */
public class While {
    public static void main(String[] args) {
        int i = 0;
        while(i < 1000){
            System.out.println(i + "Hello World!");
            i++;
        }

        //例1.2010上网人数8000万，假设每年按30%增加，问哪一年人数在增长到三亿
        int year = 2010;
        int persons = 8000;
        while (persons < 30000){
            year++;
            persons = (int)(persons * (1+0.3));
            System.out.println(year + "---" + persons);
        }
        System.out.println(year + "会增长到三亿");
        //例2.计算100以内的偶数之和
        int sum = 0;
        int a = 1;
        while (a <= 100){
            if (a % 2 == 0){
                sum = sum + a;
            }
            a++;
        }
        System.out.println("一百以内的偶数和是：" + sum);
        //例3.虚拟购物
        Scanner input = new Scanner(System.in);
        String isContinue = "";
        int money = 0;
        do{
            System.out.println("请选择：\n1.Tshirt(100)  2.jacket(200)  3.shirt(300)");
            int choice = input.nextInt();
            if (choice == 1){
                System.out.println("Tshirt\t" + 100);
                money = money + 100;
            }else if (choice == 2){
                System.out.println("jacket\t" + 200);
                money = money + 200;
            }else if (choice == 3){
                System.out.println("jacket\t" + 300);
                money = money + 300;
            }else{
                System.out.println("输入有误！");
            }
            System.out.println("当前总金额为：" + money);
            System.out.println("是否继续？ y/n");
            isContinue = input.next();
        }while (isContinue.equals("y"));

        //例4.用循环实现  登录操作：若用户名、密码错误 则给出提示，并且重新登录
        String username = "";
        String password = "";
        do{
            //设置一个提示
            if (!(username.equals("") && password.equals(""))){
                System.out.println("请重新登录");
            }
            System.out.println("请输入用户名");
            username = input.next();
            System.out.println("请输入密码：");
            password = input.next();
        }while (!(username.equals("zs") && password.equals("abc")));
        System.out.println("登录成功");
        //例5.整数的翻转输出：  12345--->54321
    }
}
