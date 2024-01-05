//How to Create Mask and Use it.

public class BitMasking {
    public static void main(String[] args) {

         int n = 36;
         int i=3;
         //Switching on the ith bits.
         int onMask = 1 << i ;

        System.out.println(n | onMask);

        //Switching off the ith bits.
        i = 5;
        int offMask = ~(1 << i);

        System.out.println(n & offMask);

        //Performing XOR Operations - Toggled the bit.

        int tmask = 1 << i;

        System.out.println(n ^ tmask);

        //Check ON or OFF Operation.

        int cmask = 1 << i;

        if((n & cmask) == 0)
            System.out.println("OFF");
        else
            System.out.println("ON");

    }
}
