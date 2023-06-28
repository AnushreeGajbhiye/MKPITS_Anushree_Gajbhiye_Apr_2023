import java.util.Scanner;

public class StarPatternMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Star Pattren number here!!(1,2,3,4,5,6)");
        String pattern = scanner.nextLine();
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        StarPatternService starPatternService = new StarPatternService();
        starPatternService.servicePattern(pattern,number);

    }
}