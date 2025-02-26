import java.util.Scanner;

public class EvenOddChecker {

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void checker(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = getScanner(); 

        while (true) { 
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt(); 

            checker(number);
        }
    }
}
