package 十丶for循环;

import java.util.Scanner;

/*
* for循环    适用于循环次数已知的情况/始末条件已知的情况
*
*
* */
public class For {
    public static void main(String[] args) {
        //例1.输入5门课程成绩，计算平均分
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("请输入第" + i + "门课的成绩");
            int score = input.nextInt();
            sum += score;
        }
        System.out.println(sum/5.0);

        //例2.求1-100之间能被7整除的数之和
        int sum2 = 0;
        for(int a=1;a<=100;a++){
            if (a % 7 == 0) {
                sum2 = sum2 + a;
            }
        }
        System.out.println(sum2);

        //例3.输出所有的水仙花数
        for (int b=100;b<1000;b++){
            int geWei = b%10;
            int shiWei = b/10%10;
            int baiWei = b/100%10;
            if (b == geWei*geWei*geWei + shiWei*shiWei*shiWei + baiWei*baiWei*baiWei){
                System.out.println(b);
            }
        }
    }

}
