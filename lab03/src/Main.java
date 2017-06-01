/**
 * Created by vladimir on 20.05.17.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 50; ++i) {
            System.out.println(i);
        }
        int t = 0;
        t += 1;
        while (t*t < 1000) {
            int f = foo(t++, (t * 2 - 3) % 10);
            System.out.println(--f);
        }
        if (!(t > - (25 + 1))) {
            t = 2;
        }
        System.out.println(t);
    }

    public static int foo(int q, int r) {
        return (q > r ? q + r : q * (--r));
    }
}
