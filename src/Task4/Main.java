/**
 * Написать программу, которая будет рисовать на консоли прямоугольник с заданными длинами сторон.
 */

package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hight: ");
        int hight = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        Angle upperLeftAngle = new UpperLeftAngle();
        Angle upperRightAngle = new UpperRightAngle();
        Angle lowerLeftAngle = new LowerLeftAngle();
        Angle lowerRightAngle = new LowerRightAngle();

    }
}
