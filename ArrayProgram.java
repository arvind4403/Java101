import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int[] num= new int[5];

        System.out.println("Enter the five integer value ");

        for (int i=0; i<+5; i++){
            System.out.println("Value "+(i+1)+":");
            num[i]=scanner.nextInt();
        }
        int sum=0;
        for (int number :num){
            sum+=number;
        }
        double average = (double) sum / num.length;

        int maximum=num[0];
        int minimum=num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maximum) {
                maximum = num[i];
            }

            if (num[i] < minimum) {
                minimum = num[i];
            }
        }
        System.out.println("Sum:" + sum);
        System.out.println("Average:" + average);
        System.out.println("Maximum:" + maximum);
        System.out.println("Minimum:" + minimum);
        scanner.close();
    }
}
