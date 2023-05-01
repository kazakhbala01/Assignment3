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

    //pop method that removes and returns the top element of the stack using the removeFirst method
    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
            return stack.removeFirst();
    }

    //peek method that returns the top element of the stack without removing it using the get method
    public T peek(){
        return stack.get(1);
    }

    // isEmpty method that returns true if the stack is empty or false if it is not using the isEmpty method
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    //getSize method that returns the number of elements in the stack using the size method for
    public int getSize(){
    return stack.size();
    }
}
