import java.util.Scanner;
import java.lang.Math;
public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in centimeter: ");
        Float cm;
        cm = scanner.nextFloat();
        Double inch = cm/2.54;
        long i;
        i = Math.round(inch);
        if(i>12){
            long x = i/12;
            System.out.println("Feet = " + x);
            long y = i-x*12;
            System.out.println("Inch = "+y);
        }
        else{
            System.out.println("Inch = "+i);
        }
    }
}
