public class CommonValue {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,5,8,9,14,15};

        for (int i=0,j=0;i<array1.length && j<array2.length;){
            if (array1[i] == array2[j]){
                System.out.println(array1[i]);
                i++;
                j++;
            }
            else if(array1[i]<array2[j]){
                i++;
            }
            else if (array1[i]>array2[j]){
                j++;
            }
        }


    }
}
