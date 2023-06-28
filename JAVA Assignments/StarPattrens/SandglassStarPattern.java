import java.util.Scanner;

public class SandglassStarPattern extends StarPattern{
    public int getStarPattern(int number1){
        for (int row = number1; row >= 0; row--) {
            for (int column = number1; column>=row; column--) {
                System.out.print(" ");
            }
            for (int space = 0; space <=(row*2); space++) {
                if(space%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int row = 0;row<=number1;row++){
            for (int column = number1; column>=row; column--) {
                System.out.print(" ");
            }
            for (int space = 0; space <= (row*2); space++) {
//                System.out.print(" *");
                if(space % 2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }
}
