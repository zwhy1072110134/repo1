package 八丶多重及嵌套选择与switch;

import java.util.Scanner;

/*
* 嵌套if
*
* 区分： 什么时候用多重if，什么时候用嵌套if   如果是同一件事，就用多重if，如果不是同一件事，就用嵌套if
*
* switch
*        switch会用 你上面赋的变量值与所有的case比配，如果匹配成功，就会执行相应case后面的语句，直到遇见break结束
*        如果变量的值与所有的case都不匹配，则执行default。。    （并且default可以省略）
*
*        switch后支持的表达式类型：int short byte char String 枚举
*
*        case的值必须是常量，且case的值不能重复
*
*
* 多重if和swith的区别
*        如果判断的是一个区间值，则用多重if ， 如果是离散/单点值，switch
* */
public class Switch {
    public static void main(String[] args) {
        //例1.>=90  优秀  >=80  良好    >=60  及格  否则不及格
        int score = 88;
        if (score > 90){
            System.out.println("优秀");
        }else if (score >=80){
            System.out.println("良好");
        }else if (score >=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        //例2.百米赛跑，10秒以内  男，进入男子组决赛  女 进入女子组决赛
        double sec = 9.8;
        char sex = '女';
        if (sec < 10){
            if (sex == '男'){
                System.out.println("进入男子组决赛");
            }else {
                System.out.println("进入女子组决赛");
            }
        }else{
            System.out.println("淘汰");
        }
        //例3.第一名奖励夏令营  第二名奖励一台笔记本电脑  第三名奖励一个U盘  否则不奖励
 /*
        int rank = 2;
        if (rank == 1){
            System.out.println("奖励夏令营");
        }else if (rank == 2){
            System.out.println("奖励笔记本电脑一台");
        }else if (rank == 3){
            System.out.println("奖励U盘一个");
        }else{
            System.out.println("没有奖励");
        }
*/
        //用switch来实现上述的功能
        int rank = 2;
        switch (rank){
            case 1:
                System.out.println("夏令营");
                break;                         //break表示整个switch结束
            case 2:
                System.out.println("笔记本电脑");
                break;
            case 3:
                System.out.println("u盘");
                break;
            default:                          //功能相当于if语句中的最后一个else
                System.out.println("不奖励");
                break;
        }

        //break一般不建议省略，但是个别情况下，可以省略
        System.out.println("请输入月份：");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {           //hasNextInt()方法是判断控制台接收是否为数字,当你在控制台输入一个字符的时候,hasNextInt()判断你输入这个字符是不是数字，而不是接收值，当if判断通过之后执行接收，也就是你输入的那个字符
               int mouth = input.nextInt(); //在这个括号内进行判断，如果是数字就对其进行赋值，如果不是数字就不对它进行赋值了

            switch (mouth) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(mouth + "月是大月");
                    break;
                default:
                    System.out.println(mouth + "月不是大月");
            }
        }else {
            System.out.println("请输入数字");
        }
    }
}
