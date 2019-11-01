package Basic_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class Node<Item> {
    public Item item;
    public Node next;
}

public class StackP2<Item> {
    private Node first;
    private int N = 0;
    private Node<Item> node;

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = (Item) first.item;
        first = first.next;
        N--;
        return item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public static void main(String[] args) {
        StackP2<String> s;
        s = new StackP2<String>();
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + " left on stack)" );
    }
}
