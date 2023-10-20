import java.util.Scanner;

public class OccurinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter any number to know the occurence in Array: ");
        int value = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] == value){
                count++;
            }
        }

        System.out.println("The Value " + value + " occurred in an array: " + count + " times.");


    }
}
