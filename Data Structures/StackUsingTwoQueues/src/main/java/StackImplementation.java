import java.util.LinkedList;
import java.util.Queue;

public class StackImplementation {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackImplementation() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int n){
        q1.add(n);
    }

    public int pop(){
        if(q1.isEmpty()) return -1;
        else return 1;
    }

}
