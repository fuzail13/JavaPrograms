/*Books Allocation Problem Using Binary Search.
In this question, you are given an array of books where each element denotes the number of pages in a book.

Now you are given a value b which is the number of students between whom you have to allocate the book such that the student who gets the maximum pages should be the minimum of all maximum possible cases.

There are some other conditions associated with the program:-
1. One book can be allocated to one student only
2. Each student should get at least one book
4. Books should be allocated in a continuous manner
4. All books should be allocated
*/
public class AllocationBooks {
     static boolean isPossibleSol(int[] ar, int b, int m){
        int student = 1;
        int spc = 0;
        for (int i=0; i<ar.length;i++){

            if(ar[i]>m){
                return false;
            }
            if (spc + ar[i] <= m){
                spc += ar[i];
            }
            else {
                student++;
                if(student > b){
                    return false;
                }
                spc = ar[i];
            }

        }
        return true;
    }
    static int maxPage(int[] ar, int b){
        if(b > ar.length)
        {
            return -1;
        }
        int low = ar[0], high = 0, res=0;
        for (int i=0; i<ar.length;i++){
            if(ar[i] < low){
                low = ar[i];
            }
            high += ar[i];
        }

        while (low <= high){

            int mid = (low + high)/2;

            if(isPossibleSol(ar,b,mid) == true){
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return res;

    }

    public static void main(String[] args) {
        int array[] = {12,34,67,90};
        int b = 2;
        System.out.println(maxPage(array,b));
    }
}
