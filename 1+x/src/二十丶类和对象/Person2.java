package 二十丶类和对象;
/*关于是否是静态方法的问题
* public static void eatFruit()     静态方法
* public void eatFruit()            动态方法
*
* 在同一个类中：
*           如果  想要调用的方法中 和 被调用的方法  中'都有static' 或者 '都没有static'，可以直接调用static
*                                              '没有static调用有static的' 也是随便调
*                                              ‘有static 调用 没有static的’ 是不能随便调用的
* 不在同一个类中：
*           万能方法：  new 对象， 对象.方法（）
*                     Person2 p = new Person2();
*                     p.eatFruit（）;
*           调用的另一个方法必须是静态的：Peroson2.eatFruit（）；//类名.方法（）  其中方法必须是static
*
*          提倡： 对象.非static方法（）
*                类.static方法（）
*
 * */

public class Person2 {
    public void eatFruit() {
        System.out.println("吃水果。。。");
    }
    public void eatFood(){
        System.out.println("吃主食。。。");
        //在一个方法中调用另外一个方法的格式是直接调用
        eatFruit();
    }

    public static void main(String[] args) {
        Person2 ww = new Person2();
        ww.eatFood();
    }
}
