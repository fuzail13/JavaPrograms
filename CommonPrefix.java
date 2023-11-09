// A Java Program to find the longest common prefix in a string array.
public class CommonPrefix {
    public static void main(String[] args) {
        String[] str = {"Hello","Hell","Hello World"};

        int min = minimum(str,str.length);

        String common = checkstr(str,min);
        System.out.println("The Common Prefix in a string is : "+common);
    }
    static int minimum(String[] str, int n){
        int temp = str[0].length();
        for(int i=1;i<n;i++){
            if(str[i].length()<temp)
                temp = str[i].length();
        }
        return temp;
    }

    static String checkstr(String str[], int n){

        String temp="";
        char current;

        for(int i=0;i<n;i++){

            current = str[0].charAt(i);

            for (int j=1;j< str.length;j++){

                if (str[j].charAt(i) != current)
                    return temp;
            }
            temp += current;

        }
        return temp;
        
    }
   


    
}
