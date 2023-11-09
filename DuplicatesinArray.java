// Java program to find the duplicate elements in an array.
import java.util.HashMap;
import java.util.Iterator;


public class DuplicatesinArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,3,2};
        HashMap<Integer, Integer> occur= new HashMap<>();
        for (int i =0;i<array.length;i++){
            if (occur.containsKey(array[i]))
                occur.put(array[i],occur.get(array[i])+1);
            else
                occur.put(array[i],1);
        }

        Iterator<Integer> itr = occur.keySet().iterator();

        while (itr.hasNext()){
            int num = itr.next();
            if (occur.get(num)>1)
                System.out.println(num+" -> "+ occur.get(num));
        }


    }
}
