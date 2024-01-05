//Program to find the Trailing Zero's in a given number.

public class TrailingZeros {

    public static void main(String[] args) {
        int num = 125;
        int count = 0;

        while (num > 0){
            if (num % 10 != 0)
                    break;
            else{
                count += 1;
                num /= 10;
            }
        }
        System.out.println("The Traling Zero's are in a number: "+count);
    }
}
