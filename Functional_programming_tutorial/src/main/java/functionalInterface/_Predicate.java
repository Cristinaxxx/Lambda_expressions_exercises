package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("070000"));
        System.out.println(isPhoneNumberValid("09083735000"));

        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("070000"));
        System.out.println(isPhoneNumberValidPredicate.test("09083735000"));

        System.out.println("Is this phone number valid and does it contain the number 3? " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09083735000"));

    }

    // Normal Java function
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    // Same thing as above but with Predicate
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    // another predicate
    static Predicate<String> containsNumber3  = phoneNumber ->
            phoneNumber.contains("3");

}
