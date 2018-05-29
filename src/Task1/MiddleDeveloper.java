package Task1;

public class MiddleDeveloper extends Developer {

    public MiddleDeveloper(String name, double basicSalary, int experience){
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 1.5) + (expirience > 0 ? basicSalary * expirience * 0.1 : 0);
    }
}
