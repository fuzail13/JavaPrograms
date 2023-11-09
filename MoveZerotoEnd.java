public class MoveZerotoEnd {

    public static void rearrange(int[] array) {
        int n = array.length;
        int j = 0;

        for (int i=0;i<n;i++){
            if(array[i]>0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={3,0,0,6,5,7,0,2,0,9,0,0,1,7};

        rearrange(array);

        for (int num : array)
            System.out.print(num + " ");
    }

}



