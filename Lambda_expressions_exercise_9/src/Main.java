import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPrime(10));
        System.out.println(isPrime(17));

        System.out.println(isPrimePredicate.test(9));
        System.out.println(isPrimePredicate.test(13));

    }

    static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static Predicate<Integer> isPrimePredicate = number -> {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    };

}


