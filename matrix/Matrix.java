
public class Matrix {
    private int size;

    private int [][] matrix;

    public Matrix(int size ){

      this.size = size;
      this.matrix = new int [size][size];
      System.out.println("Matrix created with size " + size + "x" + size);
    }

    //This populates the matrix 1 to the power of 2
    public void populateMatrix() {
      int value = 1;
      for( int matrixRow = 0; matrixRow < matrix.length; matrixRow++) {
        for (int matrixColumn = 0; matrixColumn < matrix[matrixRow].length; matrixColumn++) {
          matrix[matrixRow][matrixColumn] = value;
          value++;

        }

      }

    }
    public void printMatrix() {
      for(int matrixRow=0;matrixRow < matrix.length; matrixRow++) {
        for (int matrixColumn = 0; matrixColumn < matrix[matrixRow].length; matrixColumn++) {


       if(matrixColumn + matrixRow == 4)
        System.out.printf("%s%4d%s",  "\033[34m", matrix[matrixRow][matrixColumn], "\033[0m");
      else
        System.out.printf("%4d", matrix[matrixColumn][matrixRow]);
       if (matrixRow + matrixColumn == matrix.length - 1) {
    System.out.printf("%s%4d%s", "\033[34m", matrix[matrixRow][matrixColumn], "\033[0m");
    } else {
    System.out.printf("%4d", matrix[matrixRow][matrixColumn]);
}
      }
        System.out.println();

      };
      }

    }
    private void swap(int row1, int col1, int row2, int col2) {
      int temp = matrix[row1][col1];
      matrix[row1][col1] = matrix[row2][col2];
      matrix[row2][col2] = temp;
    }
    public void flipMatrix(){
      for(int matrixRow =0; matrixRow<size; matrixRow++)
      for(int matrixColumn = 0; matrixColumn < size; matrixColumn++){

        // This is the condition to swap the elements across the diagonal
        if(matrixRow + matrixColumn < size - 1) {
          swap(matrixRow, matrixColumn, size - 1 - matrixColumn, size - 1 - matrixRow);
        }
      }

    }
  }
