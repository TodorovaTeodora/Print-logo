import java.util.Scanner;

public class PrintLogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());
        String symbol = "*";
        String space = "-";

        // inputNumber must be > 2 and an odd number:

        if (inputNumber > 2 && inputNumber % 2 != 0) {
            // create object
            Logo printer = new Logo(inputNumber, symbol, space);
            // print
            printer.print(inputNumber, symbol, space);

        }

    }

}
