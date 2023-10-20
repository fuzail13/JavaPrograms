import javax.swing.*;

public class SumCheck {

    public static boolean CheckSum(int[] arry, int n) {
        boolean check=false;
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length; j++) {

                if (arry[i] + arry[j] == n) {
                    check = true;
                }
            }
        }
        return check;
    }
        public static void main (String[] args){

            int[] arry = {3, 1, 2, 3, 2, 2};
            int n = 6;

            System.out.println(CheckSum(arry, n));

        }

    }


