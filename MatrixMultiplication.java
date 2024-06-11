package array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int[][] result = multiplyMatrices(matrix1, matrix2);

	        System.out.println("Resultant Matrix:");
	        for (int[] row : result) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
	        int rows1 = firstMatrix.length;
	        int cols1 = firstMatrix[0].length;
	        int cols2 = secondMatrix[0].length;
	        int[][] result = new int[rows1][cols2];

	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	                }
	            }
	        }

	        return result;

	}

}
