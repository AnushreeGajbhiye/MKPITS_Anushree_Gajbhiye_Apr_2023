package whileLoop;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {
//    boolean isAccountNumberCorrect=true;

        Scanner scanner = new Scanner(System.in);
        long accountNumber=0;
        System.out.println("Enter your Account No :");
        long accountNo = scanner.nextLong();

        do {
            if(accountNumber==1234567891){
                System.out.println("Wait for further process!!");
            } else{
                System.out.println("Account no is invalid");
            }
            break;
        }
        while(accountNo!=0);
    }
}
