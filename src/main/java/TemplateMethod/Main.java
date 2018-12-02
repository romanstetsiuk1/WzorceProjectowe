package TemplateMethod;

public class Main {

    public static void main(String[] args) {

        AbstractDraw draw = new RectangleDraw(5,10);
        System.out.println("Print rectangle");
        draw.draw();

        draw = new SquareDraw(5);
        System.out.println("Print square");
        draw.draw();

    }

}
