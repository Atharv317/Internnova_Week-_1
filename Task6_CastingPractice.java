import java.util.Scanner;

public class Task6_CastingPractice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int integerValue = scanner.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        System.out.println("\n===== Original Values =====");
        System.out.println("Integer : " + integerValue);
        System.out.println("Float   : " + floatValue);
        System.out.println("Double  : " + doubleValue);

        // Implicit casting
        double intToDouble = integerValue;
        double floatToDouble = floatValue;

        System.out.println("\n===== Implicit Casting =====");
        System.out.println("Integer to Double : " + intToDouble);
        System.out.println("Float to Double   : " + floatToDouble);

        // Explicit casting
        int doubleToInt = (int) doubleValue;
        int floatToInt = (int) floatValue;

        System.out.println("\n===== Explicit Casting =====");
        System.out.println("Double to Integer : " + doubleToInt);
        System.out.println("Float to Integer  : " + floatToInt);

        scanner.close();
    }
}