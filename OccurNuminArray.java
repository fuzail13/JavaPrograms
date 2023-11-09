//Program to check the numbers of frequency in an given array.

import java.util.HashSet;
import java.util.Set;

public class OccurNuminArray {
    public static void main(String[] args) {

        int array[] = {1,1,1,2,2,2,3,4,4,5,5,5,5,6,7};

        Set set = new HashSet();
        set.add(array[0]);
        int count =1;

        for (int i=0,j=1; i<array.length;i++,j++){

            set.add(array[i]);

            if(j < array.length && array[i]==array[j] ){
                count++;
            } else if (set.contains(array[i])) {
                System.out.println(array[i]+" "+count);
                count=1;
            }
        }


    }
}
