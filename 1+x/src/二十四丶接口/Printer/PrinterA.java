package 二十四丶接口.Printer;

public class PrinterA implements InkBox,Paper{
    @Override
    public void printColor() {
        System.out.println("黑白");
    }

    @Override
    public void Paper() {
        System.out.println("A4");
    }
}
