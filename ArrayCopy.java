import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int [] array1 =  new int[n];
        int [] array2 =  new int[array1.length];

        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<array1.length;i++){
            array1[i] = sc.nextInt();
            array2[i] = array1[i];

        }
        System.out.println("Elements in the Original array: ");

        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);

        }
        System.out.println("Elements in the Copy array: ");
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]);

        }


    }
}
