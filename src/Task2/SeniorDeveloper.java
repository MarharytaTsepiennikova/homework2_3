package Task2;

import Task1.Developer;

public class SeniorDeveloper extends Developer {

    public SeniorDeveloper(String name, double basicSalary, int experience){
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 2) + (expirience > 0 ? basicSalary * expirience * 0.1 : 0);
    }
}
