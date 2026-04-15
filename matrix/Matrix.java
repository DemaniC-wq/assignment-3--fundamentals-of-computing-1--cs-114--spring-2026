public class Matrix {
    private int size;

    private int [][] matrix;

    public Matrix(int size ){

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
      }
        System.out.println();

      };

    }
  }
