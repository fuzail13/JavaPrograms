/*
Given 2 integers A & B and an array of integers C of size N. Elements C[I] represents the length of I th board.

You have to paint all N boards [C0, C1, C2, C3, ........, CN-1]. There are A painters available and each of them takes B unit of time to paint 1 unit of board.

Calculate and return the minimum time required to paint all the boards under the constraint that any painter will only pain continuous selection of board.

- 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.

- A painter will only paint continuous boards. Which means configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.

In this scenario similar to the book allocation question, the allocation is made in a continuous manner and hence we can use the binary search.
 */
public class PaintersPartition {

    static boolean isPossibleSol(int[] ar, int a, int m){
        int painter=1, pbc=0;
        for (int i=0; i<ar.length;i++){
            if (ar[i] > m){
                return false;
            }
            if(pbc + ar[i] <= m){
                pbc += ar[i];
            }
            else {
                painter++;
                if (painter > a){
                    return false;
                }
                pbc = ar[i];
            }
        }
        return true;
    }
    static int maxTime(int[] ar, int a, int b){
        int low = 0, high=0, res=-1;
        for (int i=0;i<ar.length;i++){
            high += ar[i];
        }

        while (low <= high){

            int mid = (low+high)/2;

            if(isPossibleSol(ar,a,mid) == true){
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return res*b;
    }
    public static void main(String[] args) {
        int array[] = {10,20,30,40};
        int a = 2, b =2;
        System.out.println(maxTime(array,a,b));

    }
}

