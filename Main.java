import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = scan.next();
        System.out.println("Have a good day, "+ name);

    }
}