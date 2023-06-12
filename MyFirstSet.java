import java.util.HashSet;
import java.util.Set;

public class MyFirstSet {
    public static void main(String[] args){
        Set<String> nameset = new HashSet<>();
        nameset.add("Arvind Kumar");
        nameset.add("Rahul Kumar");
        nameset.add("Rohit Singh");
        nameset.add("Mitra ji");
        nameset.add("shukla ji");
        boolean addDuplicates = nameset.add("Arvind kumar");
        System.out.println("Added duplicate value: "+addDuplicates);

        System.out.println("Name in the sets: ");
        for (String name : nameset){
            System.out.println(name);
        }
         boolean containsName = nameset.contains("Rahul Kumar");
        System.out.println("Contains name: "+containsName);

        boolean removed = nameset.remove("Mitra ji");
        System.out.println("removed name: "+removed);

        System.out.println("Sets After removal");
        for (String name : nameset){
            System.out.println(name);
        }

        int Size = nameset.size();
        System.out.println("Size of the sets is : "+ Size);

        nameset.clear();
        boolean isEmpty = nameset.isEmpty();
        System.out.println("Set is empty: "+isEmpty);
    }
}
