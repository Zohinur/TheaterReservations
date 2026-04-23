
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String userName = myScanner.nextLine();

        System.out.println("Enter your date in this format: yyyy-MM-dd");
        String dateInput = myScanner.nextLine();

        LocalDate newDate = LocalDate.parse(dateInput);

        System.out.println("How Many tickets would you like: ");
        int tickets = myScanner.nextInt();

        String s  = tickets +" ticket" + " ";
        if (tickets > 1) {
            s = tickets + "ticket" + "s";
        }

        System.out.println(userName + " " + newDate + " " + s);

    }
}
