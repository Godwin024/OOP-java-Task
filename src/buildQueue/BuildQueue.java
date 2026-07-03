package buildQueue;

public class BuildQueue {

    private String [] array = new String[5];
    private int mysize;
    private int front;


    public boolean isEmpty() {
        return mysize == 0;
    }

    public int size() {
        return mysize;

    }

    public void offer(String object) {
        array[mysize] = object;
        mysize++;

    }

    public String peek() {
        return array[front];
    }

    public String poll() {
        String removeElement = array[front];
        front++;
        mysize--;
        return removeElement;
    }
}
