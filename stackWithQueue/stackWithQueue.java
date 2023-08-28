package stackWithQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class stackWithQueue {
    public static void main(String[] args) {
//        MyStack obj = new MyStack();

    }

}

class MyStack{
    Deque queue = new ArrayDeque();
    public MyStack(){

    }
    public void push(int x) {
        queue.addLast(x);
    }

    public int pop() {
        return (int) queue.removeLast();
    }

    public int top() {
        return (int) queue.getLast();
    }

    public boolean empty() {
        return queue.size()==0;
    }
}



