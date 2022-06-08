package 二十二丶package和访问修饰符;

public class Person {
    private String name ;
    private int age;
    public void showInfo(){
        System.out.println(name+"--"+age);
    }

    //set：增删改   ，赋值
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    //get：查 ， 取值
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
