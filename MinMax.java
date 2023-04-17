class MinMax{
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        //int array[] = {9,8,7,6,5,4,3,2,1};
        int min = array[0];
        int max = array[0];
        
        for(int i = 1; i <array.length; i++){
            
            if(min < array[i])
                max = array[i];
            else if(max > array[i])
                min = array[i];
            }
            System.out.println(min+" "+max);
    }
}