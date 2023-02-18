package solid.srp;

public class SquareView {

    private int side;
    

    public SquareView(int side) {
        this.side = side;
    }


    public void draw(float zoom) {
        float res = side * zoom;

        for (int i = 0; i < res; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < res-2; i++) {
            System.out.print("*");
            for (int j = 1; j < side - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
        for (int i = 0; i < res; i++) {
            System.out.print("* ");
        }
    }
}
