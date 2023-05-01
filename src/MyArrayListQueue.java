import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    private MyArrayList<T> queue;
    public MyArrayListQueue(){
        queue=new MyArrayList<>();
    }
    //enqueue method that adds an element to the back of the queue using the add method
    public void enqueue(T element){
        queue.add(element);
    }

    //equeue method that removes and returns the front element of the queue using the remove method
    public void dequeue(T element){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        queue.remove(0);
    }

    //peek method that returns first element of queue using get method
    public T peek(){
        return queue.get(0);
    }

    //method that returns true or false if queue is empty or not respectively
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    //size method that returns size of queue
    public int size() {
        return queue.size();
    }
}
