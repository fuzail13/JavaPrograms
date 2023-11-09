public class RotatebyOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] res  = rotate(array);
        for (int i : res)
            System.out.print(i+" ");
    }
    static int[] rotate(int arr[]){
        int temp= arr[0];
        int i;
        for(i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[i-1] = temp;
        return arr;
    }
}
