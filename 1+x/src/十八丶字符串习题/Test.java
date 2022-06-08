package 十八丶字符串习题;

import java.util.StringTokenizer;

public class Test {
    public static void test01(){
        //split
        String str = "hello-world";//现在有一个字符串，通过-把它拆分成两个数组，前面半部分是第0个元素，后面的是第1个元素
        String split[] = str.split("-");
        for (int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }
        //在上述str.split()括号内，有些特殊的符号是不能够使用的，比如： .  |  \  +  *等  若想要使用上述特殊符号，需要在前面加上双斜线以转义//

        //所以，下面这种方法无论是普通字符还是特殊字符都可以作为拆分的关键词
    }
    public static void test02(){
        String str = "hello.world";
        StringTokenizer token = new StringTokenizer("hello.world",".");
        //第一个位置中填入想要处理的字符串，第二个位置中填入想要作为分隔的符号
        while (token.hasMoreElements()){
            System.out.println(token.nextElement());
        }
        //这很类似于一个数组，在通过符号对字符串进行分隔之后会返回一个值给token，这是token指向第0个元素的前面
        //token.hasMoreElements()的作用就是，先判断下一位有没有值，倘若有值，返回true，并且指向下一位，所以将它作为循环条件
        //token.nextElement()的作用就是取出当前元素
    }
/*
    //输入一个字符串，统计该字符串中某个单字符串出现的次数
    public static int test03(String input,String word){
        String str = "helloworld";
        String strs[] = str.split("");
        for (int i=0;i< strs.length;i++){
            System.out.println(strs[i]);
        }
        //用split时存在错误的风险，如果将分隔符放在末尾，是无法识别的
        return 0;
    }

 */
    //输入一个字符串，统计该字符串中某个单字符串出现的次数
    public static int test03(String input,String word){
        int count =0;
        String strs[] = new String[input.length()];
        for (int i=0;i<input.length();i++){
            strs[i] = input.substring(i,i+1);
            if (strs[i].equals(word)){
                count++;
            }
            System.out.println(strs[i]);
        }
        System.out.println(input + "中包含有" + count + "个" + word);
        return 0;
    }
    //输入一个字符串，统计该字符串中某个单字符串出现的次数
    public static int test04(String input,String a){
        int count = 0;
        while ( input.indexOf(a) != -1){
            count++;
            input = input.substring(input.indexOf(a) + 1);
        }

        return 0;
    }
    public static void test05(){
        //indexof（"子字符串"）：  子字符串在源字符串中的位置         字符--->位置
        //现在如果根据位置来找字符，我们将用到   str.charAt()方法     位置--->字符
        String str = "hexxlloworld";
        char c = str.charAt(2);
        System.out.println(c);
        System.out.println("原来的字符串是：" + str);
        String newstr = str.replace('x','y'); //str.replace('要替换的部分','想要替换成的部分')实现替换功能
        System.out.println("替换后的字符串是：" + newstr);        //这个方法不仅能够实现单个字符的替换，也能够实现子字符串的替换
    }

    public static void main(String[] args) {
        test02();
        test03("helloworld","l");
    }
}
