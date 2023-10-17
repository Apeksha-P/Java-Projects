import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first;
        System.out.println("Enter your first name: ");
        first = scanner.next();
        String middle;
        System.out.println("Enter your middle name: ");
        middle = scanner.next();
        String last;
        System.out.println("Enter your Last name: ");
        last = scanner.next();
        System.out.println(last+","+first+" "+middle.substring(0,1));
    }
}
