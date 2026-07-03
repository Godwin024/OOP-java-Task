package buildStack;

public class BuildStack {

    private String [] stackElement = new String[5];
    private int stackSize;

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public int size() {
        return stackSize;
    }

    public void push(String data) {
        stackElement[stackSize] = data;
        stackSize++;
    }

    public String peek() {
        return stackElement[stackSize -1];
    }

    public String pop() {
        stackSize--;
        return stackElement[stackSize];
    }
}
