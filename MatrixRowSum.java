//Write a program to find the row sum in a given matrix.

public class MatrixRowSum {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,6,9},
                {1,8,3},
                {4,5,7}
        };
        for (int r=0;r< matrix.length;r++){

            int sum = 0;
            System.out.print(matrix[r][0]);
            sum += matrix[r][0];

            for (int c=1;c<matrix[r].length;c++){
                sum += matrix[r][c];
                System.out.print(" + " + matrix[r][c] );

            }
            System.out.println(" = " + sum);
        }
    }
}
