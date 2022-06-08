package 二十一丶对象初始化顺序;
//一个class中虽然只能有一个public类，但是也可以同时有别的类
class father{
    public void eat(){
        System.out.println("父类eat");
    }
}
class son extends father{
    @Override                        //@Override  表示整个方法是重写父类的
    public void eat(){               //方法重写
        System.out.println("子类eat");
    }
}
class Math{
    public void add(int a,int b){
        System.out.println(a + b);
    }
    public void add(int c,int d,int e){
        System.out.println(c + d + e);
    }
}
public class Test2 {
    //方法重载：
    //这里的add（）就是方法重载，方法重载就是：方法名相同，参数列表不同（类型不同/个数不同/顺序不同）
    //注意：1.与返回值无关  2.与参数名无关（仅与参数类型有关）

    //方法重写：
    //父类中有一个方法，子类重写了一遍
    //要求：1.方法名相同 2.参数列表也相同
    //在重写时，子类的访问修饰符不能比父类的更严格 private<默认<protected<public

    //构造方法不能被重写，因为构造方法不能被继承
}
