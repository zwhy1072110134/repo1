package 实验三丶对象数组习题和猜拳游戏;

import java.util.Scanner;

public class User {
    static String name;
    static int score;

    public static int  showFist(){
        System.out.println("请出拳：\n 1.剪刀2.石头3.布");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1){
            System.out.println("您选的的是剪刀");
        }else if (choice == 2){
            System.out.println("您选择的是石头");
        }else if (choice == 3){
            System.out.println("您选择的是布");
        }else {
            System.out.println("您的输入有错");
        }
        return choice;
    }

}
