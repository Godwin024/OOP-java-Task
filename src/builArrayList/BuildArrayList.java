package builArrayList;

public class BuildArrayList {

    private String [] myArray = new String [10];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean add(String object) {
        myArray[size] = object;
        size++;
        return true;
    }

    public String remove(String object) {
        size--;
        return object;

    }

    public String remove(int index) {
        String element = myArray[index];
        size--;
        return element;

    }
}
