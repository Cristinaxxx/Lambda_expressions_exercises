import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(8);
        myIntegerList.add(4);
        myIntegerList.add(-15);
        myIntegerList.add(2);
        myIntegerList.add(4);
        myIntegerList.add(8);
        myIntegerList.add(12);

        myIntegerList.stream()
                .distinct()
                .forEach(number -> System.out.println(number));

    }
}