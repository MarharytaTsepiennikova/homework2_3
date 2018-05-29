/**
 * Написать код, который разделит список объектов Developer на 3 отдельных списка для Juniors, Seniors и Team Leads.
 * Вывести списки на экран.
 */

package Task3;

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
            if (d instanceof JuniorDeveloper) {
                sb = new StringBuilder()
                        .append("Junior developer: ")
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" -> ")
                        .append(d.getSalary());

                System.out.println(sb.toString());
            }

            System.out.println();

            if (d instanceof SeniorDeveloper) {
                sb = new StringBuilder()
                        .append("Senior developer: ")
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" -> ")
                        .append(d.getSalary());

                System.out.println(sb.toString());
            }

            System.out.println();

            if (d instanceof TeamLeadDeveloper) {
                sb = new StringBuilder()
                        .append("TeamLead developer: ")
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
