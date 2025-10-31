package java_codes;
import java.util.Scanner;

public class sam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello ,  " + name + "! Welcome to Java Programming.");
        
        scanner.close();
    }
}
