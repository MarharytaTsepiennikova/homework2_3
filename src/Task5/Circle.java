package Task5;

public class Circle extends Figure {

    protected double radius;
    protected String name;

    Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        double result;
        result = Math.PI * radius * radius;
        return result;
    }

    @Override
    public String getName() {
        return name;
    }
}
