/**
 * Придумать свое исключение и написать соответствующий класс и использующий его код.
 */
package Task8;

public class Main {
    public static void main(String[] args) throws Exception {
        List list = new List();
        try {
            list.addToList("Kotik");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
