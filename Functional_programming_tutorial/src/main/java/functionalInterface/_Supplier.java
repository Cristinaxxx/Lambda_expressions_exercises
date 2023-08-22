package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());

    }

    // Normal Java function: simply returns a value
    static String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }

    // The same but with a function:
    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";

}
