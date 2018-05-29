package Task5;

public class Square extends Rectangle {

    protected int hight;
    protected String name;

    Square(String name, int hight){
        super(name, hight, hight);
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public String getName() {
        return name;
    }
}
