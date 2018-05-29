/**
 * Создать список разработчиков и заполнить его случайным образом.
 * Вывести на экран только Senior developer-ов с зарплатой больше 1500 у.е.
 **/

package Task2;

import Task1.Developer;
import Task1.JuniorDeveloper;
import Task1.*;

public class Main {
    public static void main(String[] args) {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new MiddleDeveloper("Rita", 500, 3),
                new SeniorDeveloper("Jack", 500, 5),
                new SeniorDeveloper("Joseph", 1000,8),
                new TeamLeadDeveloper("Robby", 500, 7)
        };
        StringBuilder sb;

        for (Developer d : list){
            if (d instanceof SeniorDeveloper && d.getSalary() > 1500) {
                sb = new StringBuilder()
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" -> ")
                        .append(d.getSalary());

                System.out.println(sb.toString());
            }
        }
    }
}
