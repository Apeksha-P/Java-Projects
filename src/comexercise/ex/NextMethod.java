package comexercise.ex;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("My name is : " + input.next());
        System.out.println("Enter Your age: ");
        System.out.println("I'm " + input.next() + " Years old.");
    }
}
