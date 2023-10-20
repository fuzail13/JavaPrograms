public class ArrayDuplicacy {
    public static void main(String[] args) {
        int arr[] = {2, 4, 40, 10, 10, 2, 1, 4, 2, 1, 10, 4, 40, 20};
        sortData(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    static void sortData (int[] arr, int n){
            int pos = 0, val = 0;
            for (int i = 1; i < n; i++) {

                val = arr[i];
                pos = i;

                for (; pos > 0 && arr[pos - 1] > val;) {
                    arr[pos] = arr[pos - 1];
                    pos = pos - 1;

                }
                arr[pos] = val;
            }
        }
    }


