//Program to find if a number is a lucky number or not.

public class LuckyNumber {

    public static boolean isLuckyNumber(int n, int counter){
        if(n < counter){
            return true;
        }
        if(n % counter == 0){
            return false;
        }
        return isLuckyNumber(n-(n/counter),counter+1);
    }

    public static void main(String[] args) {
        System.out.println(isLuckyNumber(13,2));
    }
}
