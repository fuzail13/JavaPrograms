import java.util.HashSet;
import java.util.Set;

public class PairSumSorted {
    public static void main(String[] args) {
        int ar[] = {2,3,4,6,7,9};
        int sum=15;


        for (int i=0, j=ar.length-1;i<j;){
            if (ar[i] + ar[j] == sum){
                System.out.println("Pair found for sum" + sum);
                return;
            }
            else if (ar[i] + ar[j] > sum)
                    j--;
            else
                i++;

        }

    }

}
