package TemplateMethod;

public abstract class AbstractDraw {

    public void draw() {

        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    abstract int getWidth();
    abstract int getHeight();



}
