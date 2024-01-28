//Write a program to Search An Element In Bitonic Array.
public class BitonicArray {
    static int findBitonicPosition(int[] ar){
        int left =0;
        int right=ar.length-1;
        while (left<=right){
            int mid = (left+right)/2;

            if (ar[mid] > ar[mid-1] && ar[mid] > ar[mid+1]){
                return mid;
            }
            else if (ar[mid] > ar[mid-1] && ar[mid] < ar[mid+1]){
                left = mid;
            }
            else
                right = mid;
        }
        return -1;

    }

    static int searchBitonic(int[] ar, int key, int bIndex){
        if(key==ar[bIndex]){
            return bIndex;
        }
        if (key > ar[bIndex]){
            return -1;
        }
        int res1 = ascBinarySearch(ar,key,bIndex-1);
        if (res1 != -1){
            return res1;
        }
        int res2 = descBinarySearch(ar,key,bIndex+1);
        if (res2 != -1){
            return res2;
        }
    return -1;
    }

    static int ascBinarySearch(int[] ar, int key, int range){
        int low=0;
        int high = range;
        while (low<= high){
            int mid = (low+high)/2;
            if (key==ar[mid]){
                return mid;
            }
            else if(key > ar[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int descBinarySearch(int[] ar, int key, int range){
        int low=0;
        int high = range;
        while (low<= high){
            int mid = (low+high)/2;
            if (key==ar[mid]){
                return mid;
            }
            else if(key > ar[mid]){
                high = mid - 1;

            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,9,10,3,2,1};
        int key = 8;

        int bIndex = findBitonicPosition(array);
        System.out.println(searchBitonic(array,key,bIndex));


    }
}
