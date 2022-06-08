package 十一丶break和coontinue案例;

import java.util.Scanner;

/*
* break：退出循环、终止循环
* continue：跳过当前循环、继续下一次循环
* */
public class Break {
    public static void main(String[] args) {
        //例1.1~20累加，累加到哪个数字时，刚好大于30
        int sum = 0;
        for (int i=1;i<20;i++){
            sum = sum + i;
        if (sum>30){
            System.out.println(i);
            break;
            }
        }
        //例2.用户登录验证（zs、abc），验证次数最多3次
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        for (int a=0;a<3;a++){
            System.out.println("请输入用户名：");
            String name = input.next();
            System.out.println("请输入密码：");
            String pwd = input.next();
            if (name.equals("zs") && pwd.equals("abc")){
                System.out.println("登录成功");
                flag = true;
                break;
            }else{
                System.out.println("登录失败");
            }
        }
        if (!flag == true){
            System.out.println("连续输入错误3次，登录失败");
        }
        //
    }
}
