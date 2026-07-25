import java.util.*;
class MapMethods {
    public static void main(String args[]){
        //map java collection 
        //In hash mapping the order is presrved unlike the linkedhash map
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
 mapping.put("en", "England"); 
  mapping.put("es", "Spain"); 
  mapping.putIfAbsent("is", "Indian3");
  System.out.println(mapping);
  mapping.get("er");
  System.out.println(mapping);
  //check if key exist or not
  System.out.println(mapping.containsKey("Apple"));
  //returns alll key set of the 
  System.out.println(mapping.keySet());
  //get all entries from the map
  System.out.println(mapping.entrySet());

                }
}
