package finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        //When u have only one return statement right after
        Function<String, String> upperCaseName = name -> name.toUpperCase();
                                                //String::toUpperCase;

        Function<String, String> upperCaseName2 = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("exception occured");
            return name.toUpperCase();
        };

        String a = upperCaseName2.apply("");
        System.out.println(a);
    }
}
