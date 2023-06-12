import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    public static void main(String args[]) {
        List<String> grocery = new ArrayList<>();
        grocery.add("fruits");
        grocery.add("vegetable");
        grocery.add("books");
        grocery.add("pen");
        String firstGrocery = grocery.get(0);
        System.out.println("grocery: " + grocery);

        System.out.println("Enter your grocery item to add in list");
        grocery.set(0,"chocolate");
        System.out.println("update grocery list");
        for (String Grocery:grocery){
            System.out.println(grocery);
        }
        boolean removed =grocery.remove("books");
        System.out.println("Grocery item removed"+ removed);
        System.out.println("Grocery After removal");
        for (String Grocery : grocery) {
            System.out.println(grocery);
        }
        boolean containsPen = grocery.contains("Pen");
        System.out.println("contains Pen "+containsPen);

        grocery.clear();
        boolean isEmpty= grocery.isEmpty();
        System.out.println("grocery lis is Empty"+ true);



    }
}