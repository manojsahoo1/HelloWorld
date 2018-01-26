import java.util.Scanner;

public class MyAddress {
    public static void main(String[] args) {
        Scanner adr = new Scanner(System.in);

        System.out.println("Enter the name :");

        String name = adr.nextLine();

        System.out.println("Enter Age");

        int age = adr.nextInt();

        System.out.println("Enter the Company");

        String comp = adr.nextLine();

        System.out.println("Enter the city ");

        String city = adr.nextLine();

        System.out.println("Name is :" +name);
        System.out.println( "Age is :" +age);
        System.out.println("Working Company is :" +comp);
        System.out.println("City is :" +city);

    }
}
