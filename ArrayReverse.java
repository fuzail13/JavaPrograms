
class ArrayReverse{
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        
        for(int i = 0, j = array.length-1; i< array.length/2;i++,j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
        for(int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }
            
        }


    }
