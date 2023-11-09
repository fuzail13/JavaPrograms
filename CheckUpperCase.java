//Program to check the uppercase frequency in a given string.

import java.util.HashSet;
import java.util.Set;

class CheckUpperCase
{
    public static void main(String args[])
    {
        String str = "Hello World";
        Set set = new HashSet();
        set.add(str.charAt(0));
        int count = 1;
        for (int i=0,j=1; i<str.length();i++,j++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                set.add(str.charAt(i));
                if (j < str.length() && str.charAt(i) == str.charAt(j))
                    count++;
                else if (set.contains(str.charAt(i))) {
                    System.out.println(str.charAt(i) + " " + count);
                    count = 1;

                }
            }
        }
    }
}
