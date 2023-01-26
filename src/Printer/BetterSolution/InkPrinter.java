package Printer.BetterSolution;

public class InkPrinter implements CanPrint {
    private final PrinterHelper helper = new PrinterHelper();  // Composition

    @Override
    public void print() {
        helper.print();     // Delegation
    }

    public void changeInk() {}

}
