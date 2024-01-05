public class Bitwise {
    public static void main(String[] args) {
        //Bitwise OR Operator
        System.out.println(5 | 9);
        //Bitwise AND Operator
        System.out.println(5 & 9);
        //Bitwise XOR Operator
        System.out.println(5 ^ 9);
        //Bitwise Left Shift Operator
        System.out.println(5 << 1);
        //Bitwise Signed Right Shift Operator - It uses the MSB(Most Significant Bit) as a filler.
        System.out.println(5 >> 1);
        //Bitwise Tripple Right Shift or Unsigned Right Shift or Logical Right Shift Operator - It uses the zero as a filler.
        System.out.println(-5 >>> 1);
        //Bitwise Complement or Negation -> To find out the Negation of n, Formula: n = -(n+1)
        System.out.println(~2);


    }
}
