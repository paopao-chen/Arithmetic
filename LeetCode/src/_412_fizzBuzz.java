import java.util.ArrayList;
import java.util.List;

/**
 * @author Politeness Chen
 * @create 2019--07--31  16:59
 */
public class _412_fizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>(n);
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0)
                list.add("FizzBuzz");
            else if ((i + 1) % 5 == 0)
                list.add("Buzz");
            else if ((i + 1) % 3 == 0)
                list.add("Fizz");
            else
                list.add(String.valueOf(i+1));
        }
        return list;
    }
}
