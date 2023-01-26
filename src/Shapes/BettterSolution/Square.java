package Shapes.BettterSolution;

public class Square implements Rectangular {
    private final Rectangle parent;  // Composition

    public Square(int size) {
        this.parent = new Rectangle(size, size);
    }

    @Override
    public int getHeight() {
        return parent.getHeight();      // Delegation
    }

    @Override
    public int getWidth() {
        return parent.getWidth();       // Delegation
    }

    public void setSize(int size) {
        parent.setSize(size, size);
    }
}
