public class MatrixIdentical {
    public static void main(String[] args) {
        int matrix1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int matrix2[][] = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        boolean check = false;
        if (matrix1.length == matrix2.length){
            for (int r=0; r<matrix1.length;r++){
                if (matrix1[r].length == matrix2[r].length){
                    check = true;

                }
                else {
                    check = false;
                    break;
                }
            }

        }
        else {
            check = true;
        }
        if (check){
            System.out.println("The given matrix are Identical");
        }
        else {
            System.out.println("The given matrix are not Identical");
        }
    }
}
