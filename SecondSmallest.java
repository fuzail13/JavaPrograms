//Writa a Java Program to find the second smallest element in an array.
public class SecondSmallest {

    public static int secondsmallest(int[] ar){

        int min1 = 0;
        int min2 = 0;

        if(ar[0] > ar[1]){
            min1 = ar[1];
            min2 = ar[0];
        }

        for (int i=2;i<ar.length;i++){
            if (min1 > ar[i]){
                min2 = min1;
                min1 = ar[i];
            }
            else if(min2 > ar[i]){
                min2 = ar[i];
            }
        }
        return min2;
    }

    public static void main(String[] args) {
        int[] array = {100,20,300,45,5};
        System.out.println(secondsmallest(array));
    }
}
