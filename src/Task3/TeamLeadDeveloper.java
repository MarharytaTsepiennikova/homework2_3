package Task3;

import Task1.Developer;

public class TeamLeadDeveloper extends Developer {

    public TeamLeadDeveloper(String name, double basicSalary, int experience){
        super(name, basicSalary, experience);
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4) + (expirience > 0 ? basicSalary * expirience * 0.1 : 0);
    }
}
