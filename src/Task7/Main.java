/**
 * Написать аналог Integer.parseInt. Использовать исключения.
 */

package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter long number: ");
        String str = scanner.nextLine();
        try {
            number = Long.parseLong(str, 8);
            System.out.println(number);
        } catch (NumberFormatException ex){
            System.out.println("Wrong format");
        }
    }
}
