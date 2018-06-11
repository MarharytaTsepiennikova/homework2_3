package Task6;

public class Parser {
    protected static String [] [] parsedList;

    public Parser(){
        parsedList = new String[5][6];
    }

    public static class FormatExeption extends Exception{
        public FormatExeption (String messageEx){
            super(messageEx);
        }

        public String getMessage (){
            return "FormatException " + super.getMessage();
        }
    }

    public static void parseIntoList (String str) throws FormatExeption {
        String[] firstDividedList = str.split("&");

        for (int index = 0; index < firstDividedList.length; index++) {
            String[] secondDividedList;
            secondDividedList = firstDividedList[index].split("=");

            if (secondDividedList[index].equals("") || secondDividedList[index].equals(" ")) {
                throw new FormatExeption("format error!");
            }
            parsedList [index] [index]= secondDividedList[0];
            parsedList[index] [index+1] = secondDividedList[1];


            System.out.println("  " + parsedList[index][index] + " : " + parsedList [index][index+1]);

        }
    }

    public static String getParsedList (int i, int j){
        return parsedList[i][j];
    }
}
