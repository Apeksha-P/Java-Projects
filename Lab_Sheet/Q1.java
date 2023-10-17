import java.util.Scanner;

public class MidLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr word: ");
        String word = scanner.next();
        Integer length = word.length();
        Integer i = (length+1)/2-1;
        System.out.println(word.substring(i,i+1));
    }
}
