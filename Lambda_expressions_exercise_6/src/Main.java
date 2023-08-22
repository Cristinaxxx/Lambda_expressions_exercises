import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> myDoubleList = new ArrayList<>();

        myDoubleList.add(2.5);
        myDoubleList.add(3.8);
        myDoubleList.add(9.2);
        myDoubleList.add(5.1);

        double average = myDoubleList.stream()
                .mapToDouble(number -> (double) number)
                .average()
                .orElse(0.0);          // why doesn't it work without this line?!?

    }
}