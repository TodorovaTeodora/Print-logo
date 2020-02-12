import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());
        String symbol = "*";
        String space = "-";

        // inputNumber must be > 2 and an odd number:

        if (inputNumber > 2 && inputNumber % 2 != 0) {
            // create object
            Concatenation printer = new Concatenation(inputNumber, symbol, space);
            // print upper row:
            printer.printUpper(inputNumber, symbol, space);

            // print lower row:
            printer.printLower(inputNumber, symbol, space);
        }

    }

}