//Program to check the sum is present or not in an array.

public class CheckSum {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,9};
        int sum=9;
        boolean flag = false;

        for (int i=0;i<arr.length;i++){
            int checksum = 0, j=0;
            while (j<arr.length){
                checksum += arr[j];
                if (sum == checksum) {
                    System.out.println("Existed");
                    return;
                }
                j++;
            }

        }
        System.out.println("Sum is not found.");


    }
}
