package 实验三丶对象数组习题和猜拳游戏;

public class Computer {
    static String name;
     static int score;

    public static int showFist(){
        int ran = (int)(Math.random()*3)+1;
        if (ran == 1){
            System.out.println("机器人出的是剪刀");
        }else if (ran == 2){
            System.out.println("机器人出的是石头");
        }else if (ran == 3){
            System.out.println("机器人出的是布");
        }
        return ran;
    }
}
