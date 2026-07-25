import java.util.*;
class MapMethods {
    public static void main(String args[]){
        //map java collection 
        Map<String,String> mapping=new HashMap<>();
        //insertion 
        //Map java collection is used as key --> value
        mapping.put("in", "India");
        mapping.put("in","india2"); 
        System.out.println(mapping);
        Map<String,String> table=new HashMap<>();
        table.put("br","brazil");
                   table.putAll(mapping);
System.out.println(table);
//deletion
table.remove("br");
System.out.println(table.size());
table.clear();
System.out.println(table.size());
                }
}
