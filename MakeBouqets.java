/*
Given an integer array bloomday, an interger m and an integer k.
We need to make m bouquets. To make m bouquets you need to use k adjacent flowers from the garden.
The garden consists of n flowers, the ith flower will bloom in the bloomday[i] and that can be used in exactly one bouquet.
Return the minimum number of days you need to wait to be able to make m bouquets from the garden.
If it is not possible to make m bouquet, return -1.
 */
public class MakeBouqets {

    static boolean isPossibleSol(int[] ar, int boq, int flowers, int mid){
        int adj = 0, boqcount =0;
        for (int i=0;i<ar.length;i++){
            if(ar[i] < mid){
                adj++;
                if(adj == flowers){
                    boqcount++;
                    if (boq == boqcount){
                        return true;
                    }
                    adj = 0;
                }
            }
            else {
                adj = 0;
            }
        }
        return false;
    }
    static int minDayBouquets(int[] ar, int boq, int flowers){
        if(boq * flowers > ar.length){
            return -1;
        }
        int low = ar[0], high = ar[0], res = -1;
        for (int i=0;i<ar.length;i++){
            if(ar[i] < low){
                low = ar[i];
            }
            if(ar[i] > high){
                high = ar[i];
            }
        }

        while (low <= high){
            int mid = (low+high)/2;

            if(isPossibleSol(ar,boq,flowers,mid) == true){
                res = mid;
                high = mid - 1 ;
            }
            else {
                low = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {2,5,2,9,3,10,4,6,5,6};
        int bouq = 4;
        int flowers =2;
        System.out.println(minDayBouquets(array,bouq,flowers));
    }
}
