public class EquilibriumIndex {
    public static void main(String[] args) {
        int array[] = {1,2,3,7,1,2,3};
        int n = array.length;

        int[] prefixarray = new int[n];
        prefixarray[0] = array[0];

        for (int i=1;i<n;i++){
            prefixarray[i] = prefixarray[i-1] + array[i];
        }
        for (int i=0;i<n;i++){
            System.out.print(prefixarray[i]+" ");
        }
        int count = 0;
        for (int i=1;i<n;i++){
            if (prefixarray[i-1] == (prefixarray[n-1]-prefixarray[i]))
                count=i;
        }
        System.out.println("\nEquilibrium Count Index: "+count);
    }
}
