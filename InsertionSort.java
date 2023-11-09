public class InsertionSort {
    public static void main(String[] args) {

        int array[] = {10, 20, 25, 15, 64, 47, 90};
        int n = array.length;

        int val = 0, pos = 0;

        for (int i = 1; i < n; i++) {
            val = array[i];
            pos = i;

            for (; pos > 0 && array[pos - 1] > val; ) {
                array[pos] = array[pos - 1];
                pos = pos - 1;
            }
            array[pos] = val;
        }

        System.out.println("After Sort the Array...");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
