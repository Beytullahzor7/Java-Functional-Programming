package functionalinterface;

import java.util.Optional;
import java.util.function.*;

public class Trial {
    public static void main(String[] args) {
        Function<Integer, Integer> incrementByOneFunction = number -> number + 7;

        Integer a = incrementByOneFunction.apply(4);
        System.out.println(a);

        BiFunction<Integer,Integer,Integer> addAndMultiply = (num1, num2) -> (num1+5) * num2;
        System.out.println(addAndMultiply.apply(2,5));

        BiConsumer<String , Boolean> abc = (person, number) -> System.out.println("hello " + person + (number ? 10 : 5));
        abc.accept("abc", false);

        Predicate<String> isPhoneNumberValid = phoneNumber -> phoneNumber.startsWith("05") && phoneNumber.length() == 11;
        System.out.println(isPhoneNumberValid.test("05436666666"));

        Supplier<String> getWebAdress = () -> "www.google.com";
        System.out.println(getWebAdress.get());

        Optional.ofNullable("abc@gmail.com").ifPresent(email -> System.out.println("sending email to: " + email));

        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("sending to: " +email),
                () -> System.out.println("Please input your email"));




    }

}
