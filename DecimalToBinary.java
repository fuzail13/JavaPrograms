import java.util.Scanner;

public class DecimalToBinary {

    static String deciToBinary(int n){
        String res = "";
        while (n>=1){
            int x = n % 2;
            n = n / 2;
            res = x + res;
        }
        return res;
    }
    static int binaryToDecimal(String b){
        int res = 0;
        int powof2 = 1;

        for (int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1') {
                res = res + powof2;
            }
            powof2 = powof2 * 2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();
        String binary = deciToBinary(n);
        System.out.println(deciToBinary(n));
        System.out.println(binaryToDecimal(binary));
    }
}
