package 实验三丶对象数组习题和猜拳游戏;

public class Student {
    //例1.有3个学生，每个学生有姓名、两门成绩；计算每个学生的平均分、总分，并按照总分降序排序输出（姓名、总分、平均分）
    String name;
    int javaScore;
    int sqlScore;

    public double avgScore(){
        double avg = (javaScore + sqlScore)/2.0;
        return avg;
    }
    public int sumScore(){
        int sum = javaScore + sqlScore;
        return sum;
    }

}
