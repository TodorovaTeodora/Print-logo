public class Logo {
   private int inputNumber;
   private final String symbol;
   private final String space;

    public Concatenation(int inputNumber, String symbol, String space) {
        this.inputNumber = inputNumber;
        this.symbol = symbol;
        this.space = space;
    }
    public void print(int inputNumber, String symbol, String space) {
         final int range = (inputNumber + 1) / 2;
        for (int i = 0; i < range; i++) {
            StringBuilder builder = new StringBuilder();
            String concatenationUpper = space.repeat(inputNumber - i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - 2 * i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - i)
                    + space.repeat(inputNumber - i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - 2 * i)
                    + symbol.repeat(inputNumber + 2 * i)
                    + space.repeat(inputNumber - i);
            builder.append(concatenationUpper);
            System.out.println(builder.toString());

        }
        for (int i = 0; i < range; i++) {
            StringBuilder builder = new StringBuilder();
            String concatenationLower = space.repeat(inputNumber / 2 - i)
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
            builder.append(concatenationLower);
            System.out.println(builder.toString());

        }
    }

}
