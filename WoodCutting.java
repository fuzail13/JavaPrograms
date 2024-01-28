/*In this wood-cutting problem, you have a wood-cutting machine height that can be set as per the desire. Now we have a row of trees of different heights.
He has a target value of wood height desired from cutting.
We have to find the height of the wood-cutting machine
such that there is no or least waste of wood */

public class WoodCutting {
    public static int findWoodCount(int [] ar, int mid){
        int wc = 0;
        for (int i=0;i< ar.length;i++){
            if (ar[i] > mid) {
                wc = wc + (ar[i] - mid);
            }
        }
        return wc;
    }
    public static int machineHeight(int [] ar, int b){

        int max=0;

        for (int i=0;i<ar.length;i++){
            if (ar[i] > max){
                max = ar[i];
            }
        }

        int low=0, high = max, mid =0;

        while (low <= high){

            mid = (low+high)/2;

            int wc = findWoodCount(ar,mid);

            if(wc == b || low == mid){
                return mid;
            }
            else if(wc > b){
                low = mid;
            }
            else {
                high = mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] height = {20,15,10,17};
        int b = 7;
        System.out.println(machineHeight(height,b));
    }
}
