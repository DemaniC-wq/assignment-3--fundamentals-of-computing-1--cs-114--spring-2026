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

        }
  }
  // This is for the even Diamond
  public static void evenDiamond(int size) {
    int halfDiamond = size / 2;

}}
