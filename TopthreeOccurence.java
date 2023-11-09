import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TopthreeOccurence {
    public static void main(String[] args) {

        int[] arry = {2,2,2,2,2,1,1,2,1,1,3,3,3};

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.descendingMap();
        for (int i=0; i<arry.length;i++){
            if (tm.containsKey(arry[i]))
                tm.put(arry[i],tm.get(arry[i])+1);
            else
                tm.put(arry[i],1);

        }
        int count =0;

        for (Map.Entry<Integer,Integer> hm : tm.entrySet()){
            int k = hm.getKey();
            int v = hm.getValue();

            if (v >= 3){
                System.out.print(k+" ");
                count++;
            }
        }
        if (count==2)
            System.out.println("-1");
        else if (count==1)
            System.out.println("-1 -1");
    }
}
