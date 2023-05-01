# Assignment 3
This is java project of **Almas Amanbay** from **SE-2215** that contains classes MyArrayListQueue and MyArrayListStack which are implementations of MyArrayList and MyLinkedList respectively.

# MyArrayListStack
```java
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
```
## Explanation
### I had to create

#### 1 Create a new class named MyLinkedListStack for the MyLinkedList implementation or MyArrayListStack for the MyArrayList implementation.
#### 2 Import the necessary classes: java.util.EmptyStackException for the stack exceptions, and MyLinkedList or MyArrayList from the previous tasks.
#### 3 Declare an instance variable of type MyLinkedList or MyArrayList inside the class.
#### 4 Create a constructor for the class and initialize the instance variable.
#### 5 Implement the push method that adds an element to the top of the stack using the addFirst method for MyLinkedList or add method for MyArrayList.
#### 6 Implement the pop method that removes and returns the top element of the stack using the removeFirst method for MyLinkedList or remove method for MyArrayList.
#### 7 Implement the peek method that returns the top element of the stack without removing it using the getFirst method for MyLinkedList or get method for MyArrayList.
#### 8 Implement the isEmpty method that returns true if the stack is empty or false if it is not using the isEmpty method for MyLinkedList or MyArrayList.
#### 9 Implement the size method that returns the number of elements in the stack using the size method for MyLinkedList or MyArrayList.

## 5 task create push method

## solution
```java
 // push method that adds an element to the top of the stack using the addFirst method for MyArrayList

    public void push(T element){
        stack.add(element);
    }
```
