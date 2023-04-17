class EvenOdd{
    public static void main(String[] args) {
     int array[] =  {1,2,3,4,5,6,7,8,9,10};
     int evensum =0, oddsum = 0;
     for(int i = 0; i < array.length; i++)
     {
        if(array[i] % 2 == 0)
            evensum = evensum + array[i];
        else
            oddsum = oddsum + array[i];

     }
    System.out.println("The difference between Sum of Even & Odd number is:" + (evensum-oddsum));
    }
}