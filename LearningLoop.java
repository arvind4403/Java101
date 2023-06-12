public class LearningLoop {
    public static void main(String[] args){
        System.out.println("For loop");
        for (int i=0; i<=5; i++){
            System.out.println("Iteration "+i);
        }   System.out.println();
        System.out.println("While loop");
        int j=1;
        while ( j<=5){
            System.out.println("Iteration "+j);
            j++;
        }
        System.out.println();

        System.out.println("Do-While");
        int k=1;
        do {
            System.out.println("Iteration "+k);
            k++;
        }while (k <=5);
    }
}
