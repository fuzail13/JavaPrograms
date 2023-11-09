import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int k = 3;

        Scanner sc = new Scanner(System.in);
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        //First of all, we're finding the biggest value from an array.

        int big = array[0];

        for (int i = 1; i < n; i++) {
            if (big < array[i])
                big = array[i];

        }
        //Initialise the value with one in each of that element where value indicates in that index in an array.

        int freq_array[] = new int[big + 1];
        for (int i = 0; i < n; i++) {
            freq_array[array[i]] = 1;
        }
        int count = 0;
        for (int i = 0; i <= big; i++) {
            if (freq_array[i] != 0) {
                count += freq_array[i];
                if (count >= k) {
                    System.out.println(k + "th smallest elemnt value is " + i);
                    return;
                }
            }
        }
        System.out.println("Wrong..!!");
    }
}

