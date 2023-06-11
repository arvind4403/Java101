import java.util.Scanner;

public class PrintNameAge {
    public static void main(String[] args){
        Scanner myObj= new Scanner(System.in);
        System.out.println("Enter age :");
        int age=myObj.nextInt();
        myObj.nextLine();

        System.out.println("Enter your name");
        String name = myObj.nextLine();


        System.out.println("Hello, " + name + "! You are " + age + " years old.");


    }
}
