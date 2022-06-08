package 十四丶数组和冒泡排序;
/*
* 数组是在内存中开辟出一串连续的空间
* 数组名默认指向数组开头的那个元素
* 数组的使用就是  数组名+下标 例如：students[0]
* 数组的四要素：数组名  下标  类型   数组元素
*      数组的类型   和  数组元素的类型一致
*
* 数组的三种定义形式：
*               1.  int studets1[] = new int[3];           只声明数组的元素个数，但是不赋值  整数的默认值是0，所以此处的默认值就是0
*               2.  int studets2[] = new int[]{97,98,99};  不声明数组的元素个数，但是对数组进行赋值
*               3.  int studets3[] = {97,98,99};           可以理解为2的简化形式，但是又不一样，2可以拆开写（先定义，再赋值）
*
* 数组的长度：   数组名.length
* */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int students[] = new int[3];
        students[0] = 99;
        students[1] = 98;
        students[2] = 97;
        System.out.println(students[0]);

        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入第" + (i+1) + "个成绩：");
            students[i] = input.nextInt();
            sum += students[i];
        }
        System.out.println(sum);
    }
}
