package Task2;

import Task1.Developer;

public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(String name, double basicSalary, int experience){
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return basicSalary + (expirience > 0 ? basicSalary * expirience * 0.1 : 0);
    }
}
