import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        int sum = numbers.stream()
                .mapToInt(n -> n.intValue())
                .sum();

        System.out.println(sum);

        int multiplication = numbers.stream()
                .mapToInt(n -> n.intValue())
                



    }
}