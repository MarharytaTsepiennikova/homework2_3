package Task5;

public class Rectangle extends Figure {

    protected int hight;
    protected int width;
    protected String name;

    Rectangle(String name, int hight, int width){
        this.name = name;
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double getSquare() {
        double result;
        result = hight * width;
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
