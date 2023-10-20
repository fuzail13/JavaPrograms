import java.io.PrintStream;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        int filterarray[] = new int[array.length];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter any number to know the occurence in Array: ");
        for (int i=0; i<array.length;i++){
            for (int j=0; j<n; j++){

                if (filterarray[j]==array[i]){
                    continue;
                }
                else {
                    filterarray[i]=array[i];
                }

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(filterarray[i]);
        }



    }
}
