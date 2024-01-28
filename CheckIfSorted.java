/*Write a Program To Check If A Given Array Is Sorted Or Not*/

public class CheckIfSorted {
    static boolean isSorted(int[] ar){
        for (int i =1; i<ar.length;i++){
            if (ar[i] < ar[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14};
        System.out.println(isSorted(array));
    }
}
