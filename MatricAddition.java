//Write a program to find the matrix addition.


public class MatricAddition {
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
        int matrixres[][] = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        for (int r = 0; r <matrix1.length;r++) {
            System.out.print("{ ");
            for (int c=0; c<matrix1[r].length;c++){
                int sum = 0;
                matrixres[r][c] = matrix1[r][c] + matrix2[r][c];
                System.out.print( matrixres[r][c] + " ");

            }
            System.out.println("}");


        }

    }
}

