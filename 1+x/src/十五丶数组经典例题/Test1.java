package 十五丶数组经典例题;

public class Test1 {
    public static void main(String[] args) {
        //例1.寻找出一个乱序数组中的最大值和最小值
        int nums[] = {88,87,67,98,99};
        int max = nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        //例2.给67,87,88,98,99这一个数组中插入一个元素40，要求保持从小到大的顺序，并且不能使用排序算法
        int nums2[] = new int[]{67,87,88,98,99};

        //创建一个新数组，能够容纳插入后的全部元素
        int newNums[] = new int[nums2.length+1];
        for (int i=0;i<nums2.length;i++){
            newNums[i] = nums2[i];
        }

        int insert = 90;
        //位置
        int position = -1;
        for (int i=0;i<newNums.length;i++){
            if (newNums[i]>90)
            {
                position = i;
                break;
            }
        }
        System.out.println("位置：" + position);
        //平移
        for (int i = newNums.length-2;i>=position;i--){
            newNums[i+1] = newNums[i];
        }
        newNums[position] = insert;
        System.out.println("查看新的数组：");
        for (int i=0;i<newNums.length;i++){
            System.out.println(newNums[i]);
        }
    }
}
