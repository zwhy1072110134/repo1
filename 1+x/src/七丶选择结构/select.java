package 七丶选择结构;
/*
* 选择结构
* if（布尔类型）{
*      ...//如果条件是真  则执行
* }
*
* if（布尔类型）{
*      ...//如果条件是真  则执行
* }else{
*
* }
*
* 随机数：
*       Math.random();  可以取到[0,1)之间的随机数
* */
public class select {
    public static void main(String[] args) {
        //如果张三的考试成绩比小明高，则奖励一个MP3
        int xm = 98;
        int zs = 99;
        if (zs > xm){   //如果没有{}，if、for、while都只对下面的第一条语句生效
            System.out.println("奖励一个mp3");
        }else{
            System.out.println("抄10遍");
        }
        //例1.如果张三的java成绩>90 且 英语成绩>95 则奖励 ； 或者张三的java成绩>95且英语成绩>80也奖励
        int zsJavaScore = 98;
        int zsEnglishScore = 99;
        if((zsJavaScore>90 && zsEnglishScore>95) ||(zsJavaScore>95 && zsEnglishScore>80)){
            System.out.println("奖励");
        }

        //例2.如果是简单的选择结构，并且是赋值形式的语句，可以将其转换为三目运算符

//        String str = "";
//        int a = 100;
//        int b = 20;
//        if (a > b){
//            str = "Hello";
//        }else {
//            str = "world";
//        }
//        System.out.println(str);

        //将上方代码转换成三目运算符形式
        String str = 100>20 ? "hello" : "world";
        System.out.println(str);

        //随机数
        double ran = Math.random();  //取值范围[0,1)
        System.out.println(ran);

        //产生四位随机数
        //[0,1)  *9000 -->[0,9000) --> (进行int强制类型转换)-->[0,8999] +1000 -->[1000,9999]
        System.out.println((int)(Math.random()*9000+1000));
        //产生三位随机数
        //[0,1)  *900 -->[0,900) --> (进行int强制类型转换)-->[0,899] +100 -->[100,999]
        System.out.println((int)(Math.random()*900+100));
        //通式：n位随机数 ： （int）(Math.random()*(最大值+1-最小值))+n位数的最小值

        //例3.会员卡号必须是三位数，  抽奖规则：如果卡号的十位等于随机数，则中奖
        int vip = (int)(Math.random()*900+100);
        int shiWei = vip/10%10;
        int ran1 = (int)(Math.random()*10);
        if (shiWei == ran1){
            System.out.println("中奖");
        }else{
            System.out.println("没中奖");
        }
        System.out.println("具体情况如下：");
        System.out.println("您vip卡号的十位数是：" + shiWei);
        System.out.println("随机生成的数字是：" + ran1);
    }
}
