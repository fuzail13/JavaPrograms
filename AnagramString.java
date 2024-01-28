import java.util.Scanner;
import java.util.*;


public class AnagramString {
    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }
        // Complete the function
        HashMap <Character, Integer> hm1 = new HashMap<>();
        HashMap <Character, Integer> hm2 = new HashMap<>();

        int i = 0 ;
        while(i<a.length()){
            if(hm1.containsKey(a.charAt(i))){
                hm1.put(a.charAt(i), hm1.get(a.charAt(i+1)));
            }
            else{
                hm1.put(a.charAt(i),1);
            }
            i++;
        }
        int j =0;
        while(j<b.length()){
            if(hm2.containsKey(b.charAt(j))){
                hm2.put(b.charAt(j), hm2.get(b.charAt(j+1)));
            }
            else{
                hm2.put(b.charAt(j),1);
            }
            j++;
        }
        Iterator<Character> itr = hm1.keySet().iterator();
        while(itr.hasNext()){
            Character ch = (Character) itr.next();
            if(hm1.get(ch) != hm2.get(ch)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any two string: ");
        String a = scan.next();
        String b = scan.next();

        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Given string is Anagrams" : "Given string is Not Anagrams" );
    }
}

