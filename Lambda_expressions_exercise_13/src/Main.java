import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String myString = "Today is a sunny day";

        String[] stringArray = myString.split(" ");

        System.out.println(Arrays.stream(stringArray).count());

        // int count = Arrays.stream(stringArray).count()       why can't I do this??

    }
}