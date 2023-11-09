public class SubSequenceString {
    public static void main(String[] args) {

        String str = "ABCDEFG";
        String checkstr = "BCDG1111";
        int n = str.length();
        int m = checkstr.length();

        System.out.println("Subsequence String Present: "+SubSequenceString(str,checkstr,n,m));

    }
    static boolean SubSequenceString(String str, String checkstr, int n, int m){
        if (n<m)
            return false;
        int j = 0;
        for (int i=0; i<n && j<m;i++){
            if (str.charAt(i)==checkstr.charAt(j))
                j++;
        }
        return (j==m);
    }
}
