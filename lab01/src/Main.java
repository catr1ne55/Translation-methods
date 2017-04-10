import java.util.ArrayList;
import java.util.List;

/**
 * Created by catr1ne55 on 19.03.17.
 */

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        List<Integer> arab = new ArrayList<>();
        int sum_arab = 0;
        for (int i = 0; i < args.length ; i++) {
            int arab_num = converter.RometoArab(args[i]);
            arab.add(arab_num);
            System.out.println(arab_num);
            sum_arab += arab_num;
        }
        System.out.println(sum_arab);
        String sum_rome = converter.ArabToRome(sum_arab);
        System.out.println(sum_rome);
        //System.out.println(converter.ArabToRome(24));
    }
}
