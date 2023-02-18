package solid;

import solid.lsp.Rectangle;
import solid.lsp.Shape;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Square rectangle = new Square(5);
        rectangle.setSide(4);
        System.out.printf("В прямоугольнике сторона A = %d\n", rectangle.getSide());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}
