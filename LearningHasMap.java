import java.util.HashMap;
import java.util.Map;

public class LearningHasMap {
    public static void main(String[] args){
        Map<Integer,String> studentMap = new HashMap<>();

        studentMap.put(1,"Arvind");
        studentMap.put(2,"Rahul");
        studentMap.put(3,"Roshan");
        studentMap.put(4,"Ishaa");
        studentMap.put(5,"Summit");

        System.out.println(studentMap);
        String studentName = studentMap.get(2);
        System.out.println("Student with Id 2:"+studentName);

        System.out.println("Student Id\t student name :");
        for (Map.Entry<Integer,String> entry :studentMap.entrySet()){
            int studentId = entry.getKey();
            String name = entry.getValue();
            System.out.println(studentId +"\t\t" +name);
        }
        boolean containKey = studentMap.containsKey(3);
        System.out.println("contains key 3"+containKey);

        studentMap.put(4, "Oliver");
        System.out.println("Updated map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            int studentId = entry.getKey();
            String name = entry.getValue();
            System.out.println(studentId + "\t\t" + name);
        }
        String removedValue = studentMap.remove(1);
        System.out.println("Value removed"+removedValue);
        System.out.println("Map after removal:");
        for (Map.Entry entry : studentMap.entrySet()) {
            int studentId = entry.getKey();
            String name = entry.getValue();
            System.out.println(studentId + "\t\t" + name);
        }

        int size = studentMap.size();
        System.out.println("Size of the map: " + size);

        studentMap.clear();
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);
        int size = studentMap.size();
        System.out.println("Size of the map: " + size);

        studentMap.clear();
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);
    }
}
