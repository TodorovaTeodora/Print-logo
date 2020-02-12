import java.util.*;


class FindArraysMedians {
    // method for calculating mean
    public static double findMean(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += array[i];

        return (double) sum / (double) n;
    }

    // method for calculating median
    public static double findMedian(int array[], int n) {
        // First we sort the array
        Arrays.sort(array);

        // Then check for even case
        if (n % 2 != 0) return Math.ceil(array[n / 2]);

        return Math.ceil(array[(n - 1) / 2] + array[n / 2]) / 2.0;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        int numberOfInputs = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberOfInputs; i++) {
            int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int size = array.length;
            double result;
            int intResult;
            if (size % 2 == 0) {
                result = findMean(array, size);
                intResult = (int) result;
                nums.add(intResult);
            } else {
                result = findMedian(array, size);
                intResult = (int) result;
                nums.add(intResult);
            }
        }
        // print the result array
        System.out.println(nums.toString());
    }
}