package week7.week7mon;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
  Queue<Integer>  q1 = new LinkedList<>();


public void push(int x) {
    q1.add(x);
}

public int pop() {
    if (this.empty())
        return -1;
    int size = q1.size();
    while(--size > 0) {
        q1.add(q1.poll());
    }
    return q1.poll();
}

public int top() {
    if (this.empty())
        return -1;
    int size = q1.size();
    while(--size > 0) {
        q1.add(q1.poll());
    }
    int top = q1.poll();
    q1.add(top);
    return top;
}

public boolean empty() {
    return q1.isEmpty();
}

public static void main(String[] args) {
Queue<Integer>  q1 = new LinkedList<>();


  Demo demo = new Demo();
  demo.push(1);
  demo.push(2);
  demo.top(); // return 2
  demo.pop(); // return 2
  demo.empty();


}
}
