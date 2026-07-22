import java.util.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMe{
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.addFirst(5);
        list.addLast(40);
        System.out.println(list);

        list.offer(50);
        list.offerFirst(1);
        list.offerLast(60);
        System.out.println(list);

        list.add(2, 15);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.set(2, 100);
        System.out.println(list);

        System.out.println(list.contains(30));
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.pollFirst());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

        list.push(99);
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add(30);
        list.add(30);
        System.out.println(list);

        list.removeFirstOccurrence(30);
        System.out.println(list);

        list.removeLastOccurrence(30);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("For Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Enhanced For Loop");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Iterator");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Descending Iterator");
        Iterator<Integer> dit = list.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();

        System.out.println("ListIterator");
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }
        System.out.println();

        Object[] arr = list.toArray();
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(500);
        list2.add(600);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        list.addAll(list2);
        list.retainAll(list2);
        System.out.println(list);

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(40);
        nums.add(10);
        nums.add(70);
        nums.add(20);

        Collections.sort(nums);
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);

        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}
