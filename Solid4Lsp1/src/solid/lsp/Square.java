package solid.lsp;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide (int side) {
        this.side = side;
    }


    @Override
    public int getArea() {
        return (int) Math.pow(getSide(), 2);
    }

    public int getSide() {
        return side;
    }
}
