import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int number1;
        //int number2;


        System.out.println("Enter name of programmer");
        String name= input.nextLine();
        System.out.println("Enter the first integer");
        int number1 = input.nextInt();
        System.out.println("Enter the second integer");
        int number2 = input.nextInt();
        if (number1==number2)
            System.out.println("numbers are equal");

        else
            System.out.println("Numbers are not equal");
        System.out.println("Name of programmer is :"+name);
    }
}
