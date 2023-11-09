import java.util.ArrayList;

//Program to Print all Subsequences of a String.
public class GetAllSubsequence {

    static ArrayList<String> Al = new ArrayList<>();
    static void generatesubseq(String str, String ans){
        if (str.length()==0){
            System.out.println(ans);
            Al.add(ans);
            return;
        }
        //Picking Logic of a character.
        generatesubseq(str.substring(1),ans+str.charAt(0));
        //Not Picking Logic of a character
        generatesubseq(str.substring(1),ans);

    }
    public static void main(String[] args) {

        String str = "abc";

        generatesubseq(str,"");

        System.out.println(Al);
    }
}
