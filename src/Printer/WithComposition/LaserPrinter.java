package Printer.WithComposition;

public class LaserPrinter implements CanPrint {
    private final PrinterHelper helper = new PrinterHelper();  // Composition
    @Override
    public void print() {
        helper.print();     // Delegation
    }

    public void changeToner() {}
}
