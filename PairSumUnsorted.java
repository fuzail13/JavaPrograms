import java.util.HashSet;
import java.util.Set;

public class PairSumUnsorted {
    public static void main(String[] args) {
        int ar[] = {7,9,6,2,4,3};
        int sum=15;

        Set<Integer> set = new HashSet<>();
        int i = 0;

        while(i<ar.length){
            int temp = sum - ar[i];

            if (set.contains(ar[i])){

                System.out.println(temp+" "+ ar[i] +" Pair found for sum: " + sum);
                return;
            }
            i++;
            set.add(temp);
        }

    }
}
