public class Task5_TypeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting
        int integerValue = 100;
        double implicitValue = integerValue;

        System.out.println("===== Implicit Type Casting =====");
        System.out.println("Before casting (int)    : " + integerValue);
        System.out.println("After casting (double)  : " + implicitValue);

        // Explicit Type Casting
        double doubleValue = 99.75;
        int explicitValue = (int) doubleValue;

        System.out.println("\n===== Explicit Type Casting =====");
        System.out.println("Before casting (double) : " + doubleValue);
        System.out.println("After casting (int)     : " + explicitValue);
    }
}