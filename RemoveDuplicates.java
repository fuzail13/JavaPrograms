/*Write a Program To Remove Duplicates From a Sorted Array. */

public class RemoveDuplicates {

    static int removeDuplicates(int[] ar){
        int rd = 0;
        for (int i=1;i<ar.length;i++){
            if(ar[rd] != ar[i]){
                rd++;
                ar[rd] = ar[i];
            }
        }
        return rd+1;
    }

    public static void main(String[] args) {

        int[] array = {2,2,3,3,3,4,6,6};
        int rdindex = removeDuplicates(array);
        for (int i=0; i<rdindex;i++){
            System.out.print(array[i] + " ");
        }

    }
}
