// Write a program to find the Sum of an Array using recursion.
public class ArraySum {

    static int calculateSum(int [] ar,int i){

        if(i == ar.length){
            return 0;
        }
        return calculateSum(ar,i+1) + ar[i];



    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println("Sum of an array is: "+calculateSum(array,0));

    }
}
