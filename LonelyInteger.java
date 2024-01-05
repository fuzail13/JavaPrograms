import java.util.Arrays;
import java.util.HashSet;

public class LonelyInteger {
    //Brute Force Approach -> Complexity: NLog(n)
    static int findLonelyInt(int[] array){
        for (int i=0;i<array.length-2;i=i+2){
            if (array[i] != array[i+1]){
                return array[i];
            }
        }
        return array[array.length-1];
    }

    //Efficient Approach using HashSet -> Complexity : O(n)

    static int findLonelyElement(int[] array){

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : array){
            if(set.contains(i))
                set.remove(i);
            else
                set.add(i);
        }

        for (int i : set){
            return i;
        }

        return -1;

    }

    /*More Efficient Approach by using Bitwise Operator. i.e., XOR -> Complexity : O(n)

    Note: If there are pairs in a XOR, then they will cancel each other
    and what remains the same is the number which does not have a pair.
    */

    static int showLonelyElement(int[] array){

        int result = 0;

        for(int i : array){
            result = result ^ i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5,1,1,4,4,3,3};

        //The sorting is required only for Brute Force Approach.
        Arrays.sort(array);

        System.out.println("The Lonely Element in an array is: "+findLonelyInt(array));
        System.out.println("The Lonely Element in an array by using Hashset is : "+findLonelyElement(array));
        System.out.println("The Lonely Element in an array by using XOR Operator is : "+showLonelyElement(array));

    }
}

