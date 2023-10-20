public class MatrixTranspose {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int matrixT[][] = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        for (int r=0;r<matrix.length;r++){
            for (int c=0; c<matrix[r].length;c++){
                matrixT[c][r] = matrix[r][c] ;
                //System.out.print(matrixT[r][c] + " ");
            }
            //System.out.println();
        }
        for (int r=0;r<matrix.length;r++){
            for (int c=0; c<matrix[r].length;c++){
                System.out.print(matrixT[r][c] + " ");
            }
            System.out.println();
        }
    }
}
