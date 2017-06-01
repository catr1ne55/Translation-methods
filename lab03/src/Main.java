/**
 * Created by vladimir on 20.05.17.
 */
public class Main {

    public static void main(String[] args) {
        int i = 0;
        i = 1;
        while (i < 50) {
            System.out.println(foo(i, i + 1));
            ++i;
        }
    }

    public static int foo(int q, int r) {
        return (q > r ? q + r : q * (--r));
    }
}
