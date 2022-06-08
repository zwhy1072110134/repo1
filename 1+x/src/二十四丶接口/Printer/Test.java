package 二十四丶接口.Printer;

public class Test {
    public static void main(String[] args) {
        PrinterA a = new PrinterA();
        a.printColor();
        a.Paper();

        PrinterB b = new PrinterB();
        b.printColor();
        b.Paper();
    }
}
