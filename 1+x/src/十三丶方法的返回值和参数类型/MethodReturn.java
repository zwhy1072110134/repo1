package 十三丶方法的返回值和参数类型;
/*
*静态方法
*  public static void eatFruit(){}
*非静态方法
*  public void eatFruit(){}
* 方法：
*      如果是非静态方法，我们需用通过  对象.方法  来调用
*      如果是静态方法，我们既可以用  对象.方法  来调用；也可以使用  类名.static方法（）  来调用
*  如果在同一个类中：  可以直接  方法（）  来进行调用
*
* 返回值：
*       有返回值
*                 public int a(){
*                      return  1;
*                 }
*                 public String a(){
*                      return  "zs";
*                 }
*                 public  返回值类型  方法名（）{
*                      return  类型对应的数据；
*                 }
* 在调用有返回值的方法时，需要接收 String xx = a1（）;
*       没有返回值（返回值为void）
*
* 方法调用的常见情况：
*      同一个类中：
*             都有static，或者都没有static，或者没的调有的
*             静态方法不能直接调用非静态方法
*
*
* */
public class MethodReturn {
    public void a(){
        System.out.println("zs");
    }
    public String a1(){
        String name = "zs";
        System.out.println(name);
        return name;
    }

    public void b(){
        String name = a1();
        System.out.println("b:" + name);
    }
    public static void main(String[] args) {
        MethodReturn method = new MethodReturn();
        method.b();
    }
}
