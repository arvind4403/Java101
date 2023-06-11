import java.util.Scanner;

public class TwoIntValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two num values:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);

        if(num1>num2){
            System.out.println("The number one is grater"+num1);
        } else if (num2>num1) {
            System.out.println("The number two is grater" + num2);
        }else
            System.out.println("Both the number is equal");
        scanner.close();

    }
}
