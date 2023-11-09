import java.util.ArrayList;
import java.util.TreeSet;

public class UnionofArray {
    public static ArrayList<Integer> UnionArray(int[] array1, int[] array2){
        TreeSet<Integer> set = new TreeSet<>();

        for(int i : array1)
            set.add(i);
        for (int i : array2)
            set.add(i);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : set)
            list.add(i);

        return list;
    }

    public static void main(String[] args) {

        int array1[] = {1, 2, 2, 2, 2, 3};
        int array2[] = {2, 3, 3, 4, 5, 5, 6};

        ArrayList<Integer> Union = UnionArray(array1, array2);

        for(int i : Union)
            System.out.print(i + " ");
    }
}
