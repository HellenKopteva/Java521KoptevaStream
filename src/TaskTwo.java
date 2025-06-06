import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TaskTwo {
    //TODO: List of string in to int, even in to one String width separator ","
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("525");
        numbers.add("623");
        numbers.add("715");
        numbers.add("712");
        numbers.add("2");
        StringBuilder sb = new StringBuilder();
        numbers.stream().map((x) -> Integer.valueOf(x)).filter(n -> n % 2 == 0).map((n) -> String.valueOf(n)).forEach(s -> sb.append(s + ","));
        System.out.println(sb);
    }
}
