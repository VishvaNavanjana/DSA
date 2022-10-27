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

        while(q1.size() != 1){
            q2.add(q1.remove());
        }

        int pop = q1.remove();

        //Swap two queues
        Queue<Integer> temp = q2;
        q2 = q1;
        q1 = temp;

        return  pop;
    }

}
