package 二十一丶对象初始化顺序;
/*
*               访问修饰符     本类     同包     子类       其他
*               private       √
*               默认           √       √
*               protected     √       √        √
*               public        √       √        √         √
*
*               Tips：在应用protected时，需要在子类中加上这样的语句   子类  extends 父类    并且在子类中调用父类中的变量无需new，可以直接调用
*                                                                                  父子关系直接调
*                                                              如果想要实例化对象这样的形式，可以给父类添加一个static（不建议）
* */
public class B {
    int bFiled1;
    int bFiled2;
}
