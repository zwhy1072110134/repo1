package 十三丶方法的返回值和参数类型;

import java.util.Scanner;

//从键盘输入，计算三门课的平均分和总分
public class OOPScore {
    int javaScore;
    int cScore;
    int sqlScore;
    public void inputScore(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入java成绩：");
        javaScore = input.nextInt();
        System.out.println("请输入c语言成绩：");
        cScore = input.nextInt();
        System.out.println("请输入mysql成绩：");
        sqlScore = input.nextInt();
    }
    //计算平均分并返回
    public double avgScore(){
        double av = (javaScore + cScore + sqlScore)/3.0;
        return av;
    }
    //计算总分并返回
    public int sumScore(){
        int sum = javaScore + cScore + sqlScore;
        return sum;
    }

    public static void main(String[] args) {
        OOPScore score = new OOPScore();                  //通过类产生对象，通过对象来调方法
        score.inputScore();
        double avg = score.avgScore();
        int sum = score.sumScore();

        System.out.println("平均分：" + avg + " " + "总分：" + sum);
    }
}
