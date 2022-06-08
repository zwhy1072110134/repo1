package 二十二丶package和访问修饰符;
/*
*一般建议对属性/方法增加访问修饰符：
* priavate：私有的，只有当前类能够访问(同一个类)，其他类不能访问，如果想要访问，需要借助于访问器：set、get
*                                                                                set一般用于增删改   get一般用于查
* */
public class MyClass {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("张三");
        per.setAge(23);
        System.out.println(per.getName());
        System.out.println(per.getAge());
    }
}
