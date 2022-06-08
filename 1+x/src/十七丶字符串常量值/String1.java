package 十七丶字符串常量值;

public class String1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        //对于字符型的变量赋值，不同于int类型的值是将原来的值直接删除并在原来的内存空间中重新赋值，
        //字符串的重新赋值是新开辟出一个内存空间来对新的值进行存储，并且这个变量指向新的值（内存空间）

        //如果需要频繁的对字符串进行修改，则不建议使用String类，而需要使用StringBufffer类

        //在方法区中有一块内存空间叫做“常量池”,当使用字符串时，先在常量池中寻找，如果有，则使用；如果没有，则创建后放入常量池，并使用
        //第二次的时候就直接对其进行调用    “ == ”这一个判断符就是判断双等号左右是否是同一块内存地址

        String str3 = new String("hello");
        String str4 = new String("hello");
        String str5 = new String("hello");
        System.out.println("str1==str2:" + (str1 == str2));//true
        System.out.println("str3==str4:" + (str3 == str4));//false
        System.out.println("str2==str4:" + (str1 == str4));//false
        //后面两个是false的原因是因为str3、4、5在定义的时候用了new，就是新开辟了一块内存空间，所以是不相等的
        //至于为什么str2 与 str4 的 hello内存地址是一样的，因为str3、4、5在定义的时候，常量池中的hello就已经存在了，所以他们都同时应用了 str2 的 hello 的内存地址
    }
}
