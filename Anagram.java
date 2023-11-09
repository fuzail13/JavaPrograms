import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "istenl";

        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        int i =0;
        while (i<s1.length()){
            if (hm1.containsKey(s1.charAt(i)))
                hm1.put(s1.charAt(i),hm1.get(s1.charAt(i)+1));
            else
                hm1.put(s1.charAt(i),1);
            i++;
        }
        int j= 0;
        while (j<s2.length()){
            if (hm2.containsKey(s2.charAt(j)))
                hm2.put(s2.charAt(j),hm1.get(s2.charAt(j)+1));
            else
                hm2.put(s2.charAt(j),1);
            j++;
        }

        Iterator<Character> itr = hm1.keySet().iterator();
        System.out.println(hm1 + " " +hm2);

        while (itr.hasNext()){
            Character ch = (Character) itr.next();
            if (hm1.get(ch) != hm2.get(ch)){
                System.out.println("Given string is not Anagram");
                return;
            }

        }
        System.out.println("String is Anagram");
    }
}
