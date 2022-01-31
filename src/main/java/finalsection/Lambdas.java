package finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        //When u have only one return statement right after
        Function<String, String> uppurCaseName = name -> name.toUpperCase();
                                                //String::toUpperCase;

        Function<String, String> uppurCaseName2 = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        String a = uppurCaseName2.apply("Alex");
        System.out.println(a);
    }
}
