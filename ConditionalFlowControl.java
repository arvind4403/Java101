import java.util.Scanner;

public class ConditionalFlowControl {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        if(number>0){
            System.out.println("The number is positive");
        } else if (number<0) {
            System.out.println("The number is negative.");

        }else
            System.out.println("The number is Zero");
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        boolean isAdult = age>=18;
        boolean hasID=true;
        if(isAdult && hasID)
        {
            System.out.println("Your are adult and having ID");
        } else if (isAdult) {
            System.out.println("Your are adult but not have ID.");
        } else if (hasID) {
            System.out.println("Having ID but not adult");

        }else
            System.out.println("Not Adult and not having ID.");

        String result=(number%2==0) ?"even" : "odd";
        System.out.println("The number is "+result+ ".");
        scanner.close();
    }

}
