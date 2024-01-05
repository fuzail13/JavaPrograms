//Find the maximum And Pair in a given integer array.


public class MaxAndPair {
    public static int checkBits(int[] arry, int mask){
        int count = 0;
        for (int i=0;i<arry.length;i++){
            if((mask & arry[i]) == mask){
                count++;
            }
        }
        return count;

    }
    static int maxAndValue(int arry[]){
        int mask = 0;
        int res = 0;

        for (int i=31; i>=0;i--){
            mask = (1 << i) | res;
            int count = checkBits(arry,mask);
            if(count >= 2){
                res = res | mask;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arry = {16,9,6,13};

        System.out.println(maxAndValue(arry));
    }
}
