public class Main {
    public static void main(String[] args) {
        MyArrayListQueue<Integer> que=new MyArrayListQueue<>();
        que.enqueue(5);
        que.size();
        que.peek();
        MyArrayListStack<Integer> stck = new MyArrayListStack<>();
        stck.push(5);
        stck.getSize();
    }
}