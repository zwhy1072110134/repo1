package 二十三丶面向对象基本特征;
/*
* 多肽：歧义，一个词语，必须根据上下文才有实际的意义
*
*    在实例化对象时，可以应用多肽来完成实例化对象，大体型是：
*         父类名  引用对象名字  =  new  子类（）；
*     例如：Pet       pet    =   new  Dog();            多肽：父类引用指向子类对象，引用在栈空间中，子类对象在堆空间中
*
* 多肽的步骤：     1.父类
*               2.子类：子类重写父类的方法
*               3.引用时  父类引用对象名字  =  new  子类（）；
*
* 多肽的实现方法：  歧义
*
*       1.方法重载add
*       public int add(int num1,int num2){ return num1 + num2}
*       public double add(double num1,double num2,double num3){ return num1 + num2 + num3}
*
*       2.方法重写
*       class Father{
*          public void eat(){吃素...}
*       }
*       class Son extends Father{
*          public void eat(){吃荤...}
*       }
*
* 在后续调用中，将父类实例化并调用就是吃素，将子类实例化并调用就是吃荤
*       3.使用父类作为方法的形参
*       4.使用父类作为方法的返回值
*
*
* 因为在实现多肽的时候，当子类含有特有的方法，但是父类并没有这个方法，如果想要调用，就要就要对子类中方法的参数进行强制类型转换，将父类中的参数类型强行转换为子类中参数的类型
* 多肽时：  父类和子类之间的转换
*          1.就和基本数据类型一样，如果是由小转大，就自动转换
*                 double d = 10;      //double  =  int;
*          例如：  Pet pet = new Dog();
*          2.如果是由大到小，强制类型转换
*                 int i = (int)12.3;  //int  =  (int)double;
*          例如：  Dog dog  = (Dog)(new Pet());
*
* 类型转换之后我们对其进行调用
*          public class Master{
*                 public void play(Pet pet){
*                 if(pet instanceof Dog)
*                   Dog dog = (Dog)pet;
*                   dog.playCatching();
*                 }else if (pet instanceof Penguin){
*                   Penguin penguin =(Penguin)pet;
*                   penguin,playSwimming();
*                 }
*           }
*
* 对象 instanceof 类型  判断该对象是不是该类型的
*
*

* */
public class TestMaster {
    public static void main(String[] args) {
        Master master = new Master();
        Bird bird = new Bird();
        bird.setName("旺财");
        Cat cat = new Cat();
        cat.setName("咪咪");

        master.feed(bird);
        master.feed(cat);
    }
}
