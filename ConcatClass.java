public class Concatenation {
   private int inputNumber;
   private String symbol;
   private String space;

    public Concatenation(int inputNumber, String symbol, String space) {
        this.inputNumber = inputNumber;
        this.symbol = symbol;
        this.space = space;
    }
    public void printUpper(int inputNumber, String symbol, String space) {
         final int range = (inputNumber + 1) / 2;
        for (int i = 0; i < range; i++) {
            StringBuilder builder = new StringBuilder();
            String concatenation = space.repeat(inputNumber - i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - 2 * i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - i)
                    + space.repeat(inputNumber - i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - 2 * i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - i);
            builder.append(concatenation);
            System.out.println(builder.toString());


        }
    }
    public void printLower(int inputNumber, String symbol, String space) {
      final  int numOFRows = (inputNumber + 1) / 2;
        for (int i = 0; i < numOFRows; i++) {
            StringBuilder builder = new StringBuilder();
            String concatenation = space.repeat(inputNumber / 2 - i)
                    + symbol.repeat(inputNumber)
                    + space.repeat(1 + 2 * i)
                    + symbol.repeat((inputNumber * 2) - 1 - 2 * i)
                    + space.repeat(1 + 2 * i)
                    + symbol.repeat(inputNumber)
                    + space.repeat(inputNumber - 1 - 2 * i)
                    + symbol.repeat(inputNumber)
                    + space.repeat(1 + 2 * i)
                    + symbol.repeat((inputNumber * 2) - 1 - 2 * i)
                    + space.repeat(1 + 2 * i)
                    + symbol.repeat(inputNumber)
                    + space.repeat(inputNumber / 2 - i);
            builder.append(concatenation);
            System.out.println(builder.toString());

        }
    }

}
