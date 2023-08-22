import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class Main {

    public static void main(String[] args) {

        IntUnaryOperator factorial = number -> {
            int result = 1;
            for(int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println(factorial.applyAsInt(5));

    }


  /*  static int factorial(int number) {
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    } */


}