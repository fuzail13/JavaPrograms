/*Write a Program for Linear Search Algorithm.
Time Complexity -> O(n) */

public class LinearSearch {

    public static int searching(int[] ar, int key){

        for (int i=0; i<ar.length;i++){
            if(ar[i]== key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};
        int key = 99;

        System.out.println(searching(array,key));
    }
}
