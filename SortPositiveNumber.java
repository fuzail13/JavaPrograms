public class SortPositiveNumber {
    public static void main(String[] args) {
        int array[] = {4,2,-3,1,-8,6,7,-1,-5,3};

        for (int i=0;i<array.length;i++){
            if(array[i]<0)
                continue;
            else{
                for (int j=0; j<array.length;j++){
                    if (array[i]>0 && array[j]>array[i]){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        for (int i : array)
            System.out.print(i+" ");
    }
}
