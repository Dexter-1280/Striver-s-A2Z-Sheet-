import java.util.*;

public class QueueMethods {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        q.offer(40);
        System.out.println(q);

        System.out.println(q.element());

        System.out.println(q.peek());

        System.out.println(q.remove());
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.isEmpty());

        System.out.println(q.contains(30));

        q.add(50);
        q.add(60);

        System.out.println(q);

        for (Integer i : q) {
            System.out.print(i + " ");
        }

        System.out.println();

        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        Object[] arr = q.toArray();
        System.out.println(Arrays.toString(arr));

        q.clear();

        System.out.println(q);

        System.out.println(q.isEmpty());
    }
}