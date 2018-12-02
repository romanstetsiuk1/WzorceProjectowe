package TemplateMethod;

public class SquareDraw extends AbstractDraw {

    private int size;

    public SquareDraw(int size) {
        this.size = size;
    }

    @Override
    int getWidth() {
        return size;
    }

    @Override
    int getHeight() {
        return size;
    }
}
