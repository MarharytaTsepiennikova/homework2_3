package Task8;

public class List {
    protected String[] list = new String[10];
    protected int position = 0;

    public void addToList(String str) throws Exception {
        list[position] = str;
    }
}
