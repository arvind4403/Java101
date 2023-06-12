import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetQuestion {
    public static void main(String[] args){
        int i=0, n ;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of series with space:");
        String input = scanner.nextLine();

        String[] numberStrings = input.split("\\s+");

        Set uniqueNumber = new HashSet<>();

        System.out.println("\nNumber\t\tStatus");
        System.out.println("----------");

        for (String numberstring : numberStrings){
            int number = Integer.parseInt(numberstring);

            if (uniqueNumber.contains(number)){
                System.out.println(number+"\t\t Duplicate");
            }else {
                System.out.println(number+"\t\t Not duplicate");
            }

        }
        scanner.close();

    }
}