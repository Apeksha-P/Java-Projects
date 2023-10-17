import java.util.Scanner;

public class circle{
    static final double PI = 3.14;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ri;
        System.out.println("Enter inner circle radius: ");
        ri = scanner.nextInt();
        int ro;
        System.out.println("Enter outer circle radius: ");
        ro =scanner.nextInt();
        setRadius();
        computeArea(ri,ro);
        computeCircumference(ri,ro);
    }

    private static void computeCircumference(int ri, int ro) {
        Double innerCircumference = 2*PI*ri;
        Double outerCircumference = 2*PI*ro;
        Double circumference = innerCircumference + outerCircumference;
        System.out.println("Circumference = "+circumference);
    }

    private static void computeArea(int ri, int ro) {
        Double innerArea = PI*ri*ri;
        Double outerArea = PI*ro*ro;
        Double area = outerArea-innerArea;
        System.out.println("Area = "+area);
    }

    public static void setRadius(){

    }

}
