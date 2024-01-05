//Find the first repeating element in an array of integers.

import java.util.HashSet;

public class FirstRepeatingElements {

    static int firstrepeatingelement(int[] arr){

        int min = -1;

        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                min = i;
            }
            else {
                set.add(arr[i]);
            }
        }
        return min;

    }
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,7,6};

        int firstrepeatingele = firstrepeatingelement(array);

        if (firstrepeatingele != -1){
            System.out.println("The First Repeating element is: "+firstrepeatingele);
        }
        else
            System.out.println("No repeating element in an array.");

    }
}
