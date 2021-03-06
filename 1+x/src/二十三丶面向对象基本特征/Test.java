package 二十三丶面向对象基本特征;
/*
* 继承：减少代码的冗余（重复）
* 如果很多类的属性、方法 重复出现，那么可以将这些定义在父类中，子类想要使用时直接继承父类
* 继承遵循    is   a   原则      即：将子类放置于左边，将父类放置于右边，倘若句子能够通顺，那么就可以进行继承
*
* 注意：如果一个方法.方法名相同，但是方法体不同，也不能提取到父类，只有完全相同的属性和方法我们可以提取到父类当中
*
*
* 重写：父类中已经存在了一个a（）方法，在子类中再新重写一个a()方法
*      直接调用a()方法是直接a(),
*      但是此时倘若不想调用子类已经重写过的方法，而是想要调用父类中还没有被重写的方法，可以写成super.a()
*
*       在这个过程中，如果子类中重写的方法失效了，那么不管是调用子类中的方法还是调用父类中的方法，最终的呈现形式就是去调用父类中的方法
*
* 构造方法：
*      无参的构造方法：
*      public 类名(){
*
*      }
*      如果在调用时类中没有任何的构造方法，那么系统会自动提供一个无参的构造方法
*
*      有参数的构造方法：  一次性可以一次性赋多个值
*
* 如果系统中存在任何构造方法，那么系统将不再提供任何无参构造
* 所以，如果给类中编写一个无参构造，建议手动编写一个无参构造，防止报错
*
* 构造方法的两个功能：
* 1.实例化（产生对象）
* 例：Dog dog = new Dog();
*
* 2.一次性给多个属性赋值
*
* 另外构造方法在可以给多个函数一起赋值的同时，也可以进行互补，
*   例如：在一个主函数中对一个Dog对象进行输出Dog dog = new Dog("哈士奇","other......");
*    但是，在dog对象中有很多的属性还没有被赋值，此时可以用set方法来对其进行赋值
*    dog.setHealth（98）
*
* 在构造方法中 不能通过方法名 直接调用  Dog dog = new Dog（）；
* 非构造方法中（普通方法） 可以使用Dog（“abc”），即方法名直接调用
*
* 构造方法之间可以相互调用，通过this（）   ****并且，根据语法要求，在构造函数中用this（）来调用其他的构造方法，则this只能放在第一行
*
* 多个构造函数之间不能循环调用
*
* 子类在继承父类时：  private、构造方法是不能被继承的   但是可以在子类中调用父类的构造方法 super
*     super();   这句话写在子类中就表示调用父类中的无参构造
*                当在子类中调用父类中有参数的构造方法时：   super(“参数1”,“参数2”,“参数3”);
*
*
* 关于继承，小总结：
*                1.多个子类中拥有相同的方法：将其提取到父类当中，再继承即可
*                2.多个子类的方法各不相同，各自处理，不要放在父类中
*                3.多个子类的方法标签相同，但是方法体不同              使用抽象方法
*                  标签 public void print(){ ...... }
*
*
* 抽象方法：   抽象方法只有标签，没有方法体，并且，抽象方法必须包含在抽象类中
*            抽象方法必须要加 abstract 在前面对其进行修饰   例如：puclic abstract void print();
* 抽象类：  也是加abstract进行修饰      抽象类不能实例化，因为抽象类中可能有抽象方法，而抽象方法是没有方法体的，一旦实例化，后续通过变量调用抽象方法是没有方法体的
*
* final(最终):
*       1.final修饰的类，不能被继承
*       2.final修饰的方法，不能被继承
*       3.final修饰的变量属性不能被修改
*
*
*
 * */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        /*所以，在调用无参的构造方法时，是按照顺序去执行，最后执行出来的结果是：
        *      2个参数的构造方法
               1个参数的构造方法
               无参构造
        * */
        dog.setName("旺财");
        dog.setLove(99);
        dog.setHealth(98);
        dog.setStrain("哈士奇");

        dog.print();
    }

}
