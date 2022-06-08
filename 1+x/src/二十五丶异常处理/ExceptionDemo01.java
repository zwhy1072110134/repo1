package 二十五丶异常处理;

public class ExceptionDemo01 {
    public static void main(String[] args) {
//        int[] nums = new int[3];
//        System.out.println(nums[3]);//此时，输出的是此数组中下标为3的元素，但是数组的长度为3，此时数组已经越界了，编译没显示异常，但是在运行的时候会显示异常，称之为运行时异常
                                 //当运行后的异常结果在搜索时，显示其父类为RunningException
    //下面是非运行时异常
        try{
            Class.forName("ex.Demo01");      //加载器，括号内写类的名字，系统认为括号内可能存在异常，就会报错，
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
