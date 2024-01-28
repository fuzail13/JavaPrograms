//Median of two sorted Arrays with a complexity - O(m+n).

public class MergeSortedArrays {

    public static float findMedian(int[] ar1, int[] ar2){
        int i=0,j=0,k=0;

        int[] merge = new int[ar1.length+ar2.length];

        while (i < ar1.length && j< ar2.length){
            if (ar1[i] < ar2[j]){
                merge[k] = ar1[i];
                i++;
                k++;
            }
            else {
                    merge[k] = ar2[j];
                    j++;
                    k++;
                }
            }
        while (i<ar1.length){
            merge[k] = ar1[i];
            i++;
            k++;
        }
        while (j < ar2.length){
            merge[k] = ar2[j];
            j++;
            k++;
        }
        if(merge.length % 2 == 0){
            int mid = merge.length/2;
            return (float)(merge[mid]+merge[mid-1])/2;
        }
        else {
            int mid = merge.length/2;
            return merge[mid];
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1,3,8,17};
        int[] array2= {5,6,7,19,21,25};

        System.out.println(findMedian(array1,array2));
    }
}
