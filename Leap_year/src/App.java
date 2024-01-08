import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isLeapYear;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int userNumber = myScanner.nextInt();
        // divisible by 4
        isLeapYear = (userNumber % 4 == 0);

        isLeapYear = isLeapYear && (userNumber % 100 != 0 || userNumber % 400 == 0);

        if (isLeapYear) {
            System.out.println("--------------------");
            System.out.println(userNumber + " is a leap year.");
            System.out.println("--------------------");
        } else {
            System.out.println("\n" + userNumber + " is not a leap year.");
        }
        myScanner.close();
    }
}
