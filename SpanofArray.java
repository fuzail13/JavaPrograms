//Finding a Span Of An Array In Java.
public class SpanofArray {

    public static int spanofArray(int[] ar){
        int min = ar[0];
        int max = ar[0];

        for (int i=1;i<ar.length;i++){
            if (ar[i]<min){
                min = ar[i];
            }
            if (ar[i]>max){
                max = ar[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] array = {10,20,35,99,3};

        System.out.println(spanofArray(array));
    }
}
