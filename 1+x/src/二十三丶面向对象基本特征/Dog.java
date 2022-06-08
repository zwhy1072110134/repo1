package 二十三丶面向对象基本特征;

public class Dog extends Pet{
    private String strain;
    private String other;

    public String getstrain() {
        return strain;
    }

    public void setStrain(String strain) {
        strain = strain;
    }

    //下面这三个构造函数分别是无参构造函数和一个有1个参的构造函数和一个有2个参的构造方法
    //现在是想要在主函数中调用这个没有参数的构造方法，然后再用无参的构造方法区调用有1个参数的构造方法，再在有一个参数的构造方法中调用有两个参数的构造方法
    public Dog(){
        this("a");
        System.out.println("无参构造");
    }
    public Dog(String strain){
        this("b","c");
        System.out.println("1个参数的构造方法");
        this.strain = strain;
    }
    public Dog(String strain,String other){
        System.out.println("2个参数的构造方法");
        this.strain = strain;
        this.other = other;
    }


    public void print(){
        System.out.println(getName() + "\t" + getHealth() + "\t" +getLove() + "\t" + this.strain);
    }
}
