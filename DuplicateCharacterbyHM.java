// Java program to find the duplicate character in a string array by using HashMap.

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacterbyHM {
    public static void main(String[] args) {
        String str = "Hello World!!";
        char charArray[] = str.toCharArray();
        HashMap<Character, Integer> occur = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if (occur.containsKey(charArray[i]))
                occur.put(charArray[i], occur.get(charArray[i]) + 1);
            else
                occur.put(charArray[i], 1);
        }

        Iterator<Character> itr = occur.keySet().iterator();

        while (itr.hasNext()) {
            char ch = itr.next();
            if (occur.get(ch) > 1)
                System.out.println(ch + " -> " + occur.get(ch));
        }

    }
}
