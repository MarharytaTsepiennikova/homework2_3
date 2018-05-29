/**
 * Построить иерархию классов «Фигуры» с учетом знаний о полиморфизме.
 * У каждого класса фигуры должен быть метод подсчета площади.
 * Создать список фигур. Вывести площади всех фигур на экран.
 */

package Task5;

public class Main {
    public static void main(String[] args) {

        Figure[] list = {
                new Circle("Circle", 43),
                new Rectangle("Rectangle",14, 43),
                new Square("Square", 53)
        };

        StringBuilder stringBuilder;

        for (Figure index : list){
            stringBuilder = new StringBuilder()
                    .append(index.getName())
                    .append(" got square: ")
                    .append(index.getSquare());

            System.out.println(stringBuilder.toString());
        }
    }
}
