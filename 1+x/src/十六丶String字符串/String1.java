package 十六丶String字符串;

import java.util.Scanner;

/*
*    对于非基本类型（对象类型/引用类型）
*              1.只定义，不new（）（实例化）:   默认值都是null
*                 Person per；
*                 String s3；
*              2.new实例化之后，就是“空（数据类型的默认值）”
*                 String s3 = new  String();   s3:  ""
*                 Person per =new  Person();   加入person中有name（String）和age（int）两个属性的时候，实例化对象之后，name就是null，age是0
*
*     记忆方法：  在不进行实例化之前，，默认值都是null，   Xxx  xx  =new  Xxx（）;形式下
*               但是在实例化之后，1.xx的值不是null，xx内部的属性值目前全部是数据类型的默认值
*
*
*
*
* */
public class String1 {
    static String s3 ;//全局变量有默认值  是null
    public static void test1(){
        //定义字符串的方式一：
        String s = "abcd";
        System.out.println(s);
        //基本数据类型： int num = 10;
        //对象类型： Person per = new Person();

        //定义字符串的方式二：
        String s1 = new String("helloworld");
        System.out.println(s1);

        //定义字符串的方式三：
        String s2 = new String(); //这种方式下生成的字符串s2是“ ”，不是null，是一个空的字符串

        //常见的Stirng方法
        String str = "helloworld";
        boolean flag = str.equals("helloworld");         //1.str.equals();是比较str这个字符串的内容是否与括号内的一致，倘若一致会返回布尔类型的值
        boolean flag2 = str.equalsIgnoreCase("helloworld");//2.str.equalsIgnoreCase()作用基本同上，但是不严格区分大小写
        System.out.println(flag);//输出结果是：true
        System.out.println(flag2);//输出结果是：true

        int len = str.length();//3.str.length()能够获取到这个字符串的长度
        System.out.println(len);//输出结果是：10

        str = str.toUpperCase();//4.str.toUpperCase()是能够将字符串全部转换为大写字母
        System.out.println(str);//输出结果是：HELLOWORLD

        str = str.toLowerCase();//5.str.toLowerCase()能够将字符串全部转换为小写字母
        System.out.println(str);//输出结果是：helloworld

        int position = str.indexOf("owo");//6.str.indexOf()能够将括号内的子字符串放到原字符串中，找出子字符串开始的位置，如果不存在就会返回值-1
        System.out.println(position);//输出结果是：4

        str = str.trim();//7.str.trim()可以去除原字符串中首尾的空格
    }
    public static boolean isValidateEmail(String email){
        if (email.indexOf("@")<email.indexOf(".")){
            return true;
        }
        return false;
    }
    //校验电话号码是否合法
    public static void testSubstring(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入想要验证的号码：");
        String phone = input.next();
        if (phone.indexOf("-") != -1){
            System.out.println("座机号码");
            //phone.substring()这个方法中可以设置两个参数，用逗号隔开，作用就是将原本的字符串从第一个位置截取到第二个位置，但是左边的能取到，右边的取不到
            //判断座机的合法性就是先判断前面的区号是3/4位，后面的号码是8位

            //左侧
            int start = 0;
            int end = phone.indexOf("-");
            String zone = phone.substring(start,end);
            if (zone.length() == 3 || zone.length() == 4){
                System.out.println("区号正确");
            }else{
                System.out.println("区号有误");
            }

            //右侧
            int startRight = end +1;
            String  zone2 = phone.substring(startRight);
            if (zone2.length() == 8){
                System.out.println("号码格式正确");
            }else{
                System.out.println("号码格式错误");
            }
        }else{
            System.out.println("手机号码");
            String first = phone.substring(0,1);
            if (first.equals("1") && phone.length() == 11){
                System.out.println("格式合法");
            }else{
                System.out.println("格式不合法");
            }
        }

    }
    public static void main(String[] args) {
        boolean result = isValidateEmail("1072110134@qq.com");
        System.out.println(result == true ? "格式合法" : "格式不合法");

        testSubstring();

    }

}
