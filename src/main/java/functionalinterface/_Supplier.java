package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());

        System.out.println(getDBConnectionURLSupplier.get());

        System.out.println(getDBConnectionURsSupplier.get());

    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionURsSupplier = () ->
            List.of("jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customers");

}
