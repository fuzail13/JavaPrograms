import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        int array[] = {2,4,10,7,8,4,12};
        int prefixarray[] = new int[array.length];
        prefixarray[0] = array[0];

        for (int i=1; i<array.length;i++){
            prefixarray[i] = prefixarray[i-1] + array[i];
        }
        System.out.println(Arrays.toString(prefixarray));
        System.out.println("---------------------------");

        int t = new Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);
        while (t-- > 0){
            int range1 = sc.nextInt();
            int range2 =  sc.nextInt();
            System.out.println("Range sum value is: "+prefixarraysum(prefixarray,range1,range2));
        }
        System.out.println("Enter Range for Prefix even count: ");
        int range1 = sc.nextInt();
        int range2 = sc.nextInt();

        System.out.println("Prefix even count: "+prefixarraycount(array,range1,range2));
    }
    static int prefixarraysum(int prefixarray[], int range1, int range2){
        if(range1>range2)
            return 0;
        else if(range1==0 && range2 < prefixarray.length)
            return prefixarray[range2];
        else
            return prefixarray[range2] - prefixarray[range1-1];
    }
    static int prefixarraycount(int array[], int range1, int range2) {
        if (range1 > range2)
            return 0;
        int prefixcount[] = new int[array.length];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                prefixcount[i] = ++x;
            else
                prefixcount[i] = x;


        }
        System.out.println(Arrays.toString(prefixcount));
        return prefixcount[range2] - prefixcount[range1 - 1];
    }


}
