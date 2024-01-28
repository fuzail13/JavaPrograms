//Find Ceil and Floor of an Number in a sorted Array.

public class CeilAndFloor {

    public static int ceil(int[] ar, int key){
        int low = 0;
        int high = ar.length-1;

        while (low<=high){

            int mid = (low + high)/2;
            if(key<ar[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if (low<ar.length) {
            return ar[low];
        }
        else {
            return -1;
        }
    }

    public static int floor(int[] ar, int key){
        int low = 0;
        int high = ar.length-1;

        while (low<=high){

            int mid = (low + high)/2;
            if(key<ar[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if (high>=0){
            return ar[high];
        }
        else {
            return -1;
        }
    }


    public static void main(String[] args) {
        int[] array = {13,15,25,60,75,80,92};
        int key = 68;

        System.out.println(ceil(array,key));
        System.out.println(floor(array,key));

    }
}
