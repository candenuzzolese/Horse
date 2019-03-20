package New;

public class Stack<T> {


    private Object[] stack;
    private int length;
    private int capacity;


    public Stack(int capacity) {

        length = -1;
        this.capacity = capacity;
        stack = new Object[capacity];
    }

    public void pop(){
        length--;

    }
    public void push(T element){
        if (length == stack.length-1){
            extend();
        }
        length++;
        stack[length] = element;
    }

    private void extend() {
        Object[] pileAux = new Object[2*capacity];
        for (int i = 0; i < capacity; i++) {
            pileAux[i] = stack[i];
        }
        stack = pileAux;
    }

    public T peek(){
        if (!isEmpty()){
            return (T) stack[length];
        }
        return null;
    }

    public boolean isEmpty(){
        if(length == -1){
            return true;
        }
        return false;
    }

    public int size(){
        return length;
    }

    public void empty(){
        length = -1;
    }
}
