public class MaximumSubArray {
    public static void main(String[] args) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is: " + maxSubArray(array));
    }

    static int maxSubArray(int array[]) {
        int n = array.length;
        int maximum = array[0];
        int sum = 0, start = 0, end = 0, counter = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
            if (maximum < sum) {
                maximum = sum;
                start = counter;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                counter = i + 1;
            }
        }


        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return maximum;
    }



}
