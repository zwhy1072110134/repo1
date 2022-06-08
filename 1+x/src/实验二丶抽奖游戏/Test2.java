package 实验二丶抽奖游戏;

import java.util.Scanner;

/*
* 抽奖游戏
* 1.注册 2.登录 3.抽奖
* 注册时，系统会自动生成一个4位的随机数作为卡号，
*
* 登录成功后，才能进行抽奖
* 抽奖时，系统会生成6个4位随机数作为幸运数字，如果会员卡号是其中之一，则成为本日的幸运会员，否则就不是幸运会员
* */
public class Test2 {
    public static void main(String[] args) {
        String reqistName = "";
        String reqistPwd = "";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        reqistName = input.next();
        System.out.println("请输入密码：");
        reqistPwd = input.next();
        System.out.println("注册完毕。。。。。。");
        int vipNum = (int)(Math.random() *9000) +1000;

        String  loginName = "";
        String  loginPwd = "";
        System.out.println("登录用户名：");
        loginName = input.next();
        System.out.println("登录密码：");
        loginPwd = input.next();

        if (loginName.equals(reqistName) && loginPwd.equals(reqistPwd)){
            System.out.println("登录成功！");
            System.out.println("抽奖：");
        }else{
            System.out.println("用户名或密码错误");
        }

        int luckyNum[] = new int[6];
        for (int i=0;i<6;i++){
             luckyNum[i] = (int)(Math.random() *9000) +1000;
             System.out.println("中奖卡号是：" + luckyNum[i]);
        }
        System.out.println("你的vipNum是" + vipNum);

        boolean flag = false;
        for (int i=0;i<6;i++){
            if (vipNum == luckyNum[i]){
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("没有中奖");
        }else{
            System.out.println("中奖了");
        }


    }

}
