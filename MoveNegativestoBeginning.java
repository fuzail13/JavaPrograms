//Writa a Program to Move all negative numbers to beginning and positive to end with constant extra space.
public class MoveNegativestoBeginning {
    public static void rearrange(int[] array) {
        int n = array.length;
        int j = 0; //Index for negative numbers.

        //Iterate through the array and move the negative numbers to the beginning.
        for (int i=0;i<n;i++){
            if(array[i]<0){
                //Swap array[i] with array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={1,-2,-3,4,5,-6,7};

        rearrange(array);
        //Print the modified array
        for (int num : array)
            System.out.print(num + " ");
    }
}

//Output: -2 -3 -6 4 5 1 7
