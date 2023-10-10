package comexercise.ex;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your name is "+name + " and your are "+age +"years old.");
    }
}
