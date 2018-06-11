/**
 * Написать метод разбора списка параметров в формате URL: para1=value1&param2=value2&param3=value3.
 * В случае ошибки в формате бросать исключение.
 */

package Task6;

public class Main {
    public static void main(String[] args) {
        String[] urlStr = {"para1=value1&param2=value2&param3=value3"};
        Parser parser = new Parser();

        for (int index = 0 ; index <= 3 ; index++){
            try {
                parser.parseIntoList(urlStr[index]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
