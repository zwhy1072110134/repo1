package 二十四丶接口.Printer;

public class PrinterB implements InkBox,Paper{
    @Override
    public void printColor() {
        System.out.println("彩色");
    }

    @Override
    public void Paper() {
        System.out.println("B5");
    }
}
