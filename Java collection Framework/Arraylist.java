
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

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
System.out.println(list);
        Collection<Integer> collection=new ArrayList<>();
    }
}
