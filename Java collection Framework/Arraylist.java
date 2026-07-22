
import java.util.*;

public class Arraylist {
    public static void main(String args[]){
        //List or collection->interface
        //arraylist->concreate class
        ArrayList<Integer> arr=new ArrayList<>();
        //add
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
       arr.add(50);
       //remove the element
       arr.remove(2); 
       System.out.println(arr);

        List<Integer> list=new ArrayList<>();
        list.add(9);
System.out.println(list);
//to add all 
list.addAll(arr);
System.out.println(list.size());
//to remove all
//list.removeAll(list);
//System.out.println(list);
list.clear();
// I want to traverse list using iterator
ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        Iterator<String> it = fruits.iterator();
//An Iterator in the Java Collection Framework is an object that lets you traverse (iterate through) the elements of a collection one by one without needing to know how the collection is implemet

        while (it.hasNext()) {
            System.out.println(it.next());
        }
List<Integer> list2=new ArrayList<>();
list2.add(40);
list2.add(10);
list2.add(50);
list2.add(100);
System.out.println(list2.get(0));
System.out.println(list2.set(0,44));

//to array
Object[ ] arrrr=list2.toArray();
for( Object obj :arr){
    System.out.println(obj);
}
//for sorting 
Collections.sort(list2);
System.out.println("Printing the entrie list"+list2);
//for sorting in descending order

 Collections.sort(list2, Collections.reverseOrder());
System.out.println(list2);

}
    }


