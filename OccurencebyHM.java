import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurencebyHM {
        public static void main(String[] args) {
            int array[]  = {1,3,2,5,1,2,3,1,1,1,6,7,5};

            Map<Integer, Integer> hm = new HashMap<>();

            int i = 0;
            int count=0;
            while (i < array.length) {
                if (hm.containsKey(array[i]))
                    hm.put(array[i],hm.get(array[i])+1);
                else
                    hm.put(array[i], 1);
                i++;
            }

            Iterator<Integer> itr = hm.keySet().iterator();
            System.out.println(hm);

            while (itr.hasNext()) {
                Integer k = (Integer) itr.next();

                System.out.println(k+" "+ hm.get(k) );

            }
        }


}
