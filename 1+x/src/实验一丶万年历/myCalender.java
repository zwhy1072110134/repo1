package 实验一丶万年历;
//计算闰年的方法，如果一个年份能够被4整除并且不被100整除   或    一个数字能不被400整除
public class myCalender {
    public static void main(String[] args) {
        int days = 0;
        //2019.1.1 --> 2019.9.30
        for(int i=1;i<10;i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days += 30;
                    break;
                default:
                    if ((2019%4==0 && 2019%100!=0) || 2019%400==0){
                        days += 29;
                    }else{
                        days += 28;
                    }
            }
        }
        System.out.println(days);//到这里已经计算出2019年前九个月共有多少天了
        ++days;//days自增一，时间已经来到了2019.10.1
        System.out.println(days);
        //星期n = 天数%7
        int xingQi = days%7;
        System.out.println(xingQi);
        System.out.println("2019.10.1是星期" + xingQi);
    }
}
