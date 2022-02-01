package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object value =  Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(value);

        Supplier<IllegalArgumentException> exception = () -> new IllegalArgumentException("exception");
        Object value2 = Optional.ofNullable("Hello")
                .orElseThrow(exception);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending to email " + email));

        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email"));

        //System.out.println(value);
    }
}
