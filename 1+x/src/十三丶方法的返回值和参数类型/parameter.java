package 十三丶方法的返回值和参数类型;
/*
* 有参数和没参数的区别：
*                 没有参数的话，一般实现共性
*                 有参数的话一般实现个性  参数越多，越具有个性化
* 当方法的括号内同时存在多个类型相同的参数时，可以用数组来简化
* 当方法的括号内同时存在多个类型不同的参数时，可以用对象来简化
* */
public class parameter {
    public void sleep1(String name,String place){
        System.out.println(name + "在" + place + "睡觉");
    }
    public void playing(String infos[]){
        System.out.println(infos[0] + "在" + infos[1] + "玩" + infos[2]);
    }

    public static void main(String[] args) {
        parameter zs = new parameter();
        zs.sleep1("张三","沙沟湖");
        parameter ls = new parameter();
        ls.sleep1("李四","桃花岛");

        parameter ww = new parameter();
        String[] infos1 = {"李新伟","宿舍","英雄联盟"};
        ww.playing(infos1);
        parameter ql = new parameter();
        String[] infos2 = {"张冠吉吉","厕所","屎"};
        ql.playing(infos2);
    }
}
