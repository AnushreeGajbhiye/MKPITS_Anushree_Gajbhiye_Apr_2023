import java.util.Scanner;

public class DecreasingStarPattern extends StarPattern {
    public int getStarPattern(int number1) {
  //      for (int i = 1; i <= 5; i++) {
//            for(int j=1; j<=i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
            for (int row = 1; row <= number1; row++) {
                for (int column = number1; column >= row; column--) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            return 0;


        }
    }






