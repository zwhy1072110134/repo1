package 一丶第一个JAVA程序详解;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("HelloWorld!");
    }
}
/* 1.class 后面的叫做类名
   2.public class后面的类名必须和文件名保持一致
   3.一个文件可以有多个类（class），但是只能有一个公共类（public class）
   4.System.out.println(“”);是输出语句
   5.每个语句以";"结尾（程序中的所有英文都是半角英文符号）
   6.括号都是成对出现，并且要在写代码的时候注意缩进    Tab键
   7.程序的入口就是main（）方法（其他语言称之为函数）
   8.System.out.println("");作为输出语句，在println中“ln”自带换行功能
     System.out.println("");这样输出结果中就不会自动回车了
     当然，通过添加\n也能够对输出语句实现

   9.转义符：
         \n 回车的效果
         \t制表符  空格的效果                             如果在.java文件中有汉字，并且在Javac编译时出现了错误提示“错误：编码GBK的不可映射字符”
         \t可以补满一定位数，在cmd中补满八位                 解决办法：将文件的编码改为ANSI编码
                                                       注意：java采用的默认编码集是unicode
   10.单行注释//
      多行注释/*......*/                                                                                                                                 /*
      文档注释/**......*/         /*                    将程序生成一个说明文档，则说明文档中，说明文字就是通过文档注释生成
   11.开发工具
             notepad++   cmd
             Intellij Idea
             Eclipse
 */