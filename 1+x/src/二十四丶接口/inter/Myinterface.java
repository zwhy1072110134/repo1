package 二十四丶接口.inter;
/*
 * 接口： interface
 * public interface Person{
 *
 *    1.属性都是static final 类型
 *    2.接口中只有public abstract
 *    public abstract void eat（）；
 *    public abstract void sleep（）；
 *}
 * 抽象方法：相当于一中约定，
 * publice abstract void eat（）；
 * 接口比抽象类更进一步抽象
 *
 * 之前学习继承的时候，将父类和子类之间的关系读作 A  is a  B       ...是一个...
 * 现在接口适合于  has  a  的形式，可以理解为有什么什么功能
 *         类    has  a   接口
 *
 *接口和抽象类一样，也不能实例化
 *
 *        类比关系：
 * 父类eat()  -->  子类
 * 接口eat()  -->  实现类
 *
 * 继承：类
 * 实现：接口
 * A extends B{}
 * A implements C{}
 *
 * 接口之间是可以相互继承的，多继承
 * 接口也可以实现多肽，就是类似实例化对象那种
*/
public interface Myinterface {
    //一般建议：final类型的变量，变量名大写，如果是多个单词，可以使用下划线隔开

    //这样写，等同于 static final int NUM = 10；
    int NUM = 10;
    //这里没有加abstract的原因是，这里默认就是 public abstract
    public void eat();


}
