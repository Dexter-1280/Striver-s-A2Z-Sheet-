import java.util.*;

public class VectorMethods {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Python");
        v.add("C++");
        v.add("Java");
        System.out.println(v);
 v.add(1, "HTML");
        System.out.println(v);
   v.addElement("CSS");
        System.out.println(v);

    Vector<String> extra = new Vector<>();
        extra.add("JavaScript");
        extra.add("React");

        v.addAll(extra);
        System.out.println(v);

        System.out.println(v.get(2));

        System.out.println(v.firstElement());

        System.out.println(v.lastElement());

        System.out.println(v.size());

        System.out.println(v.capacity());

        System.out.println(v.contains("Python"));

        System.out.println(v.indexOf("Java"));

        System.out.println(v.lastIndexOf("Java"));

        System.out.println(v.isEmpty());

        v.set(2, "C");
        System.out.println(v);

        v.setElementAt("Bootstrap", 1);
        System.out.println(v);

        v.insertElementAt("SQL", 3);
        System.out.println(v);

        v.remove("Java");
        System.out.println(v);

        v.remove(2);
        System.out.println(v);

        v.removeElement("React");
        System.out.println(v);

        v.removeElementAt(0);
        System.out.println(v);

        System.out.println(v.elementAt(1));

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        ListIterator<String> li = v.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        for (String s : v) {
            System.out.print(s + " ");
        }
        System.out.println();

        v.forEach(System.out::println);

        Object[] arr = v.toArray();
        System.out.println(Arrays.toString(arr));

        Vector<String> copy = (Vector<String>) v.clone();
        System.out.println(copy);

        v.ensureCapacity(20);
        System.out.println(v.capacity());

        v.trimToSize();
        System.out.println(v.capacity());

        v.setSize(10);
        System.out.println(v);

        v.clear();
        System.out.println(v);

        System.out.println(v.isEmpty());
    }
}