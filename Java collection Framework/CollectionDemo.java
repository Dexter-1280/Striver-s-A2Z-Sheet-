import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        System.out.println("----- LinkedList -----");

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.addFirst("HTML");
        list.addLast("React");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        list.offer("SQL");
        list.offerFirst("CSS");
        list.offerLast("JavaScript");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        System.out.println(list.contains("Java"));
        System.out.println(list.size());

        System.out.println("\n----- Vector -----");

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        vector.addElement("HTML");

        System.out.println(vector);

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        System.out.println(vector.get(1));

        vector.set(1, "JavaScript");

        System.out.println(vector);

        System.out.println(vector.contains("Java"));
        System.out.println(vector.indexOf("Java"));

        vector.remove("C++");

        System.out.println(vector);

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        Enumeration<String> e = vector.elements();

        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }

        System.out.println();

        System.out.println("\n----- Stack -----");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.search(20));

        System.out.println(stack.empty());

        System.out.println(stack.size());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.empty());
    }
}