package DataStructuresAlgorithm.DAY_48;

import java.util.LinkedList;

public class JavaCollectionFrameworkLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        ll.addFirst(0);
        ll.addFirst(2);
        ll.addFirst(5);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
