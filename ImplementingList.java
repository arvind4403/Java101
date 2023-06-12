import java.util.ArrayList;
import java.util.List;

public class ImplementingList {
    public static void main(System[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("grapes");
        fruits.add("Litchi");

        String firstFruits = fruits.get(0);
        System.out.println("First Fruits: " + firstFruits);

        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        boolean containBanana = fruits.contains("Banana");
        System.out.println("Contain banana:" + containBanana);

        fruits.add(2,"Guava");
        System.out.println("Update fruits list:");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        boolean removed = fruits.remove("Mango");
        System.out.println("Mango removed: " + removed);
        System.out.println("Fruits after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        int size = fruits.size();
        System.out.println("size list: " + size);
    }
}
