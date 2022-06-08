package 实验三丶对象数组习题和猜拳游戏;
/*
* 数组的形式解析：
*             int[] nums = new int[] {1,2,3}
*             String[] name = new String[] {"aaa","bbb","ccc"}
*             类型[] 变量名 = new 类型[]{元素值，元素值，元素值}
*             Student[] students = new Student[]{stu1,stu2,stu3}   --大括号内的是对象数组
* */
public class TestStudent {
    public static void conpareStudent(Student[] students){
        for (int i=0;i<students.length-1;i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].sumScore() < students[j + 1].sumScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.javaScore = 99;
        stu1.sqlScore = 98;

        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.javaScore = 91;
        stu2.sqlScore = 98;

        Student stu3 = new Student();
        stu3.name = "王五";
        stu3.javaScore = 96;
        stu3.sqlScore = 95;

        double stu1Avg = stu1.avgScore();
        int stu1Sum = stu1.sumScore();

        double stu2Avg = stu2.avgScore();
        int stu2Sum = stu2.sumScore();

        double stu3Avg = stu3.avgScore();
        int stu3Sum = stu3.sumScore();
        //创建对象数组
        Student[] students = new Student[]{stu1,stu2,stu3};

        //先行打印一次
        System.out.println("姓名" + "\t" + "javaScore" + "\t" + "sqlScore" + "\t" + "平均分" + "\t" + "总分");
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].name + "\t\t" + students[i].javaScore + "\t\t" + students[i].sqlScore + "\t\t\t" + students[i].avgScore() + "\t" + students[i].sumScore());
        }
        System.out.println("-------------------------------------");

        //调用上面定义的比较方法
        conpareStudent(students);

        //打印逆序排列后的成绩单
        for (Student student:students){
            System.out.println(student.name + "\t\t" + student.javaScore + "\t\t" + student.sqlScore + "\t\t\t" + student.avgScore() + "\t" + student.sumScore());
        }
    }
}
