import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
<<<<<<< Updated upstream
=======

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number for the size of the diamond: ");

    int diamondSize = input.nextInt();
    int oddDiamond;

    if (diamondSize % 2 == 0) {
    evenDiamond(diamondSize);
} else {
    oddDiamond(diamondSize);

>>>>>>> Stashed changes
    input.close();
  }
      }
      //Method for the odd Diamond
      public static void oddDiamond(int size) {
        int middleRow = size / 2;
        for(int row = 0 ; row < size ; row++) {
          int stars;

          if(row<= middleRow){
            stars= 2 * row + 1;
          } else {
            stars = 2 * (size - row - 1) + 1;
          }
          int spaces = (size - stars) / 2;
          for(int spaceCount=0; spaceCount < spaces; spaceCount++) {
            System.out.print(" ");
          }
          for(int starCount=0; starCount < stars; starCount++) {
            System.out.print("*");
          }
          System.out.println();
        }

        }
  }

  // This is for the even Diamond
  public static void evenDiamond(int size) {

    int halfDiamond = size / 2;

    // Top half
    for (int row = 1; row <= halfDiamond; row++) {

        for (int space = 0; space < halfDiamond - row; space++) {
            System.out.print(" ");
        }

        for (int star = 0; star < 2 * row; star++) {
            System.out.print("*");
        }

        System.out.println();
    }

    // Bottom half
    for (int row = halfDiamond - 1; row >= 1; row--) {

        for (int space = 0; space < halfDiamond - row; space++) {
            System.out.print(" ");
        }

        for (int star = 0; star < 2 * row; star++) {
            System.out.print("*");
        }

        System.out.println();
    }
}}
