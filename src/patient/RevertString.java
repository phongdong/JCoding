package patient;

public class RevertString {
    public static void main(String[] args) {
        revertString("hello");
    }

    static void revertString(String s) {
        if (s == null || s.length() <= 1) {
            System.out.println(s);
        } else {
            System.out.print(s.charAt(s.length() - 1));
            revertString(s.substring(0, s.length() - 1));
        }

    }
}
