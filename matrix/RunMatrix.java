import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of the matrix: ");
    int matrixSize = input.nextInt();

    Matrix matrix = new Matrix(matrixSize);
    matrix.populateMatrix();
    System.out.println("Original Matrix:");
    matrix.printMatrix();

    matrix.flipMatrix();
    System.out.println("Flipped Matrix:");
    matrix.printMatrix();


  }
}
