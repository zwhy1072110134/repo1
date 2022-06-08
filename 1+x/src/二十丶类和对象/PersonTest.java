package 二十丶类和对象;
/*
*Person per = new  Person（）;       实例化对象
*  一般而言，对象是指堆里面的东西，（new出来的对象都是保存在堆内存中），栈内存中的zs称为引用
*  引用：相当于c语言中的指针，持有对象的内存地址
* 对象在使用前必须实例化（new）
*
* 属性：就是全局变量
* 全局变量： 方法以外，类以内：  有初始值（数据类型的默认值）
* 局部变量： 方法内部          没有初始值，在使用之前必须赋初值
* 全局变量和局部变量可以同名，但是，在局部变量所在方法中，该变量的值是局部变量的值，因为局部变量的值将全局变量的值给覆盖了
* */

//属性是每个对象独有的，而方法是共享的
public class PersonTest {
    public static void main(String[] args) {
        Person zs = new Person();
        //对象调用属性和方法的书写格式是    对象.属性    对象.方法
        zs.name = "张三";
        zs.age = 18;

        System.out.println(zs.name);
        System.out.println(zs.age);
        zs.eat();
        zs.sleep();


        Person ls = new Person();
        ls.name = "李四";
        ls.age = 15;

        System.out.println(ls.name);
        System.out.println(ls.age);
        ls.eat();
        ls.sleep();
    }
}
