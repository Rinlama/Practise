

package lecture2;

import java.util.*;


public class ListPractise {
    
    
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        
        stringList.add("Moe");
        stringList.add("Larry");
        stringList.add("Curly");
        
        System.out.println("Size : " +stringList.size());
        System.out.println("get index 0 : " + stringList.get(0));
        System.out.println("get index 1 : " + stringList.get(1));
        
        stringList.set(0,"john");
        stringList.remove(1);
        System.out.println("*********First Print Method :*******");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("*****Second  Print Method :*********");
        for (String name: stringList) {
            System.out.println(name);
        }
        System.out.println("*****Extra Credit Print:*********");
        System.out.println("*****Third Print Method :*********");
        
    }
    
}
