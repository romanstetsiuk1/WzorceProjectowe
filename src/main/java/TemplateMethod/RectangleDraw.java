package TemplateMethod;

public class RectangleDraw extends AbstractDraw {

    private int width;
    private int height;

    public RectangleDraw(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int getWidth() {
        return width;
    }

    @Override
    int getHeight() {
        return height;
    }


}
