package 实验四丶图书管理系统;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestBookManager {
    public static void main(String[] args) {

        bookManager manager = new bookManager();
        manager.init();

        manager.menu();




        Date date =new Date();
        System.out.println(date);

        //Date <-> String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //Date -> String
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
    }
}
