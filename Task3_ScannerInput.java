import java.util.Scanner;

public class Task3_ScannerInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.print("Enter your college name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter your branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println("\n===== Entered Information =====");
        System.out.println("Full Name    : " + fullName);
        System.out.println("Age          : " + age);
        System.out.println("College Name : " + collegeName);
        System.out.println("Branch       : " + branch);
        System.out.println("City         : " + city);

        scanner.close();
    }
}
