package 实验二丶抽奖游戏;

import java.util.Scanner;

//输入省份，系统自动输出这个省对应的城市
public class Test3 {
    public static void main(String[] args) {
        String[] provinces = {"陕西","山西","四川"};
        //核心：一维数组的下标正好是二维数组的行号
        String[][] cities = {
                {"西安","咸阳","渭南"},
                {"太原","运城","大同"},
                {"成都","都江堰","广元"}
        };
        Scanner input = new Scanner(System.in);
        System.out.println("请输入想要查询的省份：");
        String p =  input.next();
        int postion = -1;
        for(int i=0;i<provinces.length;i++){
            if (p.equals(provinces[i])){
                postion = i;
                break;
            }
        }
        for (int j=0;j<cities[postion].length;j++){
            System.out.println(cities[postion][j]);
        }
    }

}
