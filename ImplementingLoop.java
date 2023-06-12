import com.sun.source.tree.WhileLoopTree;

public class ImplementingLoop {
    public static void main(String[] args){
        System.out.println("for loop");
        for (int i=1; i<=20; i++){
            System.out.println("no "+i);
        }System.out.println();

        System.out.println("While loop");
        int j=1;
        while (j<=20){
            if (j%2==0){
                System.out.println(j);
            }
            j++;
        }System.out.println();
    }
}
