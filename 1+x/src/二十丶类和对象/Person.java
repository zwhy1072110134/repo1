package 二十丶类和对象;
/*类和对象：
*    类是抽象的，人
*    对象是具体的，张三
*    多个对象可以抽象出一个类，类可以产生任意个对象
*
* 类：是由一组抽象的属性方法构成
* 对象：由一组特定属性和方法构成
*
* 类和对象的组成部分：
*   静态：  属性     身高、体重、年龄
*   动态：  方法     吃饭、睡觉
*
* 类可以细分，但是产物不一定是一个对象，也可能还是一个类
* */
public class Person {
    //静态  属性
    String name;
    int age;

    //动态  方法
    public void eat(){
        System.out.println("吃饭。。。");
    }
    public void sleep(){
        System.out.println("睡觉。。。");
    }
}
