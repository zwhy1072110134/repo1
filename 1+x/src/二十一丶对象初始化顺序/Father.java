package 二十一丶对象初始化顺序;

public class Father {
    static {
        System.out.println("父类static......");
    }

    {
        System.out.println("父类普通代码块......");
    }

    public Father(){
        System.out.println("父类无参......");
    }
}
