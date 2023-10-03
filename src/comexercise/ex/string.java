package comexercise.ex;

public class string {
    public static void main(String[] args) {
        String text = " This is a sentence.";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.length());
        char c = text.charAt(6);
        System.out.println(c);
        System.out.println(text.indexOf('t'));
        System.out.println(text.concat("Apeksha"));
    }
}
