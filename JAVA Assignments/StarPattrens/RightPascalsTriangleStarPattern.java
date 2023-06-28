import java.util.Scanner;

public class RightPascalsTriangleStarPattern extends StarPattern{
    public int getStarPattern(int number1){
        for (int row = 1; row <= number1; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int row=1; row<=number1; row++){
            for(int column=number1; column>=row; column--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return 0;

    }

    }

