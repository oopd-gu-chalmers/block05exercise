package Shapes.WithComposition;

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

    @Override
    public void setHeight(int height) {
        parent.setHeight(height);       // Delegation
    }

    @Override
    public void setWidth(int width) {
        parent.setWidth(width);         // Delegation
    }

    @Override
    public void setSize(int height, int width) {
        parent.setSize(height, width);  // Delegation
    }

    public void setSize(int size) {
        setSize(size, size);
    }
}
