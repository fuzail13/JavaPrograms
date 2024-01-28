/*Program To Find Square Root/Floor Of Square Root Of A Number.*/

public class SquareRoot {

    static int sqrt(int n){

        if(n == 0 || n == 1){
            return n;
        }
        int low=2, high = n/2;
        int res = 0;

        while (low <= high){

            int mid = (low+high)/2;
            if(mid * mid == n){
                return mid;
            }
            else if(mid * mid < n){
                low = mid + 1;
                res = mid;
            }
            else {
                high = mid - 1;
            }
        }
    return res;
    }

    public static void main(String[] args) {
        int n = 24;
        System.out.println(sqrt(n));
    }
}
