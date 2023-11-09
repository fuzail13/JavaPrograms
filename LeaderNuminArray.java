import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LeaderNuminArray {
    public static void main(String[] args) {

        int[] arr ={7,10,4,10,6,5,2};

        List arrylst = new ArrayList<>(Arrays.asList(arr));


        System.out.println(arrylst);


        showleadernumber(arrylst);

    }

        static void showleadernumber(List arr) {

            Iterator itr = arr.iterator();
            while (itr.hasNext())
                System.out.println(itr.next());

        }
}
