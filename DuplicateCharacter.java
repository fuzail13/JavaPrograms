// Java program to find the duplicate character a string.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateCharacter{
    public static void main(String[] args) {

        String str = "Malayalame";
        duplicateChar(str);


    }
    static void duplicateChar(String str) {
        Set set = new HashSet();
        set.add(str.charAt(0));
        int count = 1;
        HashMap<Character, Integer> occur= new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int j = i+1;
            set.add(str.charAt(i));
            while (j < str.length() ) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
                j++;
            }
            if (!occur.containsKey(str.charAt(i))) {
                occur.put(str.charAt(i),count);

            count = 1;

            }
        }
        Iterator<Character> itr = occur.keySet().iterator();

        while (itr.hasNext()){
            char ch = itr.next();
            if (occur.get(ch)>1)
                System.out.println(ch+" -> "+ occur.get(ch));
        }
    }
}
