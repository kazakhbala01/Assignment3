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
        queue.remove(0);
    }

    //peek method that returns first element of queue using get method
    public T peek(){

    }
}
