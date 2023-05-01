import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    private MyArrayList<T> stack;
    public MyArrayListStack(){
        stack = new MyArrayList<>();
    }

    // push method that adds an element to the top of the stack using the addFirst method for MyArrayList

    public void push(T element){
        stack.add(element);
    }

}
