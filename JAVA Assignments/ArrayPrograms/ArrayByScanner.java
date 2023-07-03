import java.util.Scanner;

public class ArrayByScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int size = scanner.nextInt();

        int number[] = new int[size];
        for(int counter=0; counter<size;counter++){
            System.out.println(number[counter]);
        }
    }
}
