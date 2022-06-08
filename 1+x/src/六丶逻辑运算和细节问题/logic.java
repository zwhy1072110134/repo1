package 六丶逻辑运算和细节问题;
/*
*   %:有符号问题.  结果永远与被除数一致
*
* 逻辑运算符
*     ！：不等于
*     两个符号的： &&    根据真值表判断（短路特性）   一个符号的：&            不具有短路特性，一切都会判断
*               ||                                      |
* 三目运算符：
*     x = 布尔判断 ？ a ： b;           判断结果为true，赋a的值，判断结果为false，赋b的值
* */
public class logic {
    public static void main(String[] args) {
        System.out.println( 10%3 );   //1
        System.out.println( -10%3 );  //-1
        System.out.println( 10%-3 );  //1
        System.out.println( -10%-3 ); //-1

        System.out.println(2<1 && 1/0==0);//假
        System.out.println(2>1 || 1/0==0);//真
    }
}
