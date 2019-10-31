package Basic_1;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QueueP {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        while(!StdIn.isEmpty()) {
            q.enqueue(StdIn.readInt());
        }

        int N = q.size();
        for (int i = 0; i < N; i++) {
            StdOut.println(q.dequeue() + "");
        }
    }
}
