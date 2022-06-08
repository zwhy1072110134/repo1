package 十二丶双重循环;

public class doubleCirculate {
    public static void main(String[] args) {
        //例1.打印一个三行六列的星阵
        for(int i=0;i<3;i++){  //外部循环控制行
            for (int j=0;j<7;j++){  //内部循环控制列
                System.out.print("*");
            }
            System.out.println();
        }
        //例2.打印一个直角三角形
        for (int a=0;a<=5;a++){
            for (int b=0;b<a+1;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //例3.打印一个倒三角形
        for (int c=5;c>=0;c--){
            for (int d=0;d<c+1;d++){
                System.out.print("*");
            }
            System.out.println();
        }
        //例4.打印一个空心的菱形
        for(int e = 0;e < 4;e++){
            for (int f = 0;f < 3-e;f++){
                System.out.print(" ");
            }
            for (int g = 0;g < 2*e+1;g++){
                if(g == 0 || g == 2*e){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int e = 2;e >= 0;e--){
            for (int f = 0;f < 3-e;f++){
                System.out.print(" ");
            }
            for (int g = 0;g < 2*e+1;g++){
                if(g == 0 || g == 2*e){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //例5.打印九九乘法表
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + j*i + "\t\t");
            }
            System.out.println(" ");
        }
        /*例6.有一个数列：  8 4 2 1 23 344 12
              1.求所有数字的和
              2.随机产生一个1-3之间的数，判断数列中是否有此数
              3.进行排序，并输出结果
         */
        int sum = 0;
        int numbers[] = {8,4,2,1,23,344,12};
        for (int i=0;i<numbers.length-1;i++){
            sum += numbers[i];
        }
        System.out.println(sum);
        //此处生成随机数的逻辑，利用这个函数随机生成一个数，生成的数在[0,1)之间的数，乘以3之后，就是[0,3)之间的数，此时取整数，也就是0，1，2三个数，再加一，就是1，2，3
        boolean flag = false;
        int ran = (int)(Math.random()*3) + 1;
        System.out.println("随机数是：" + ran);
        //算法逻辑是，将随机生成的随机数与这个数组中的数挨个匹配，如果有匹配成功的则退出循环
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i] == ran){
                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
        System.out.println("排序之前：");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + "\t");
        }
        //排序方式一：  直接调用JAVA_HOME中已有的函数来进行排序
        //Arrays.sort(numbers);


        //排序方式二：  冒泡排序       冒泡排序的算法逻辑是，当前的这个数是否比下一个数大，若果是，就把两个数进行交换，如果不是，就不用交换
        //总结：如果是n个数字进行比较，一共需要比较n-1次
        //每轮的规则是什么？    if[nums[i] > nums[i+1]]{交换}
        /*
        * 假定有n个数据，
        * 外层循环：第一趟  第二趟  第三趟
        * 内层循环: 每趟内部再进行两两比较
        * for（i=1;i<n-1;i++）
        * */
        for(int i=0;i<numbers.length-1;i++){
            for(int j=0;j<numbers.length-1-i;j++){
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("排序之后：");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + "\t");
        }
    }
}
