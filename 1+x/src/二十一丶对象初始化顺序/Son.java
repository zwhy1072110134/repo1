package 二十一丶对象初始化顺序;

public class Son extends Father{
    static {
        System.out.println("子类static......");
    }

    {
        System.out.println("子类普通代码块......");
    }
    public Son(){
        System.out.println("子类无参......");
    }
}
