public class RotatebyOneClock {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int[] res  = rotate(array);
            for (int i : res)
                System.out.print(i+" ");
        }
        static int[] rotate(int arr[]){
            int temp= arr[arr.length-1];
            int i;
            for(i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            return arr;
        }


}
