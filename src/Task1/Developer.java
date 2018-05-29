package Task1;

public abstract class Developer {
    protected String name;
    protected double basicSalary;
    protected int expirience;

    public Developer(String name, double basicSalary, int expirience){
        this.name = name;
        this.basicSalary = basicSalary;
        this.expirience = expirience;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
}
