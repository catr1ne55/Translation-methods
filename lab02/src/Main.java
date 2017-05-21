/**
 * Created by vladimir on 20.05.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world.");
        int x = 42;
        for (int i = 0; i < 42; ++i) {
            x += i;
        }
        System.out.println(x);
        System.out.println(foo(x));
    }

    public static String foo(int x) {
        return ("Haskell is better than Java. " + (x * 0 + 42));
    }
}
