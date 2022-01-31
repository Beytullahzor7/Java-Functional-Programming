package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function takes 1 argument and produces one result
        int number1 = incrementByOne(2);
        System.out.println(number1);

        Integer number2 =  incrementByOneFunction.apply(2);
        System.out.println(number2);

        Integer number3 = multiplyBy10Function.apply(4);
        System.out.println(number3);

        //Combine 2 method
        Function<Integer, Integer> addBy1andThenMultiply10 =  incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1andThenMultiply10.apply(5));

        // BiFunction takes 2 argument and produces one result

        System.out.println(incrementByOneAndMultiply(2,100)); //normalJavaFunction

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,50)); //biFunction
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number){
        return number+1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
        (numberToIncrementByOne, numberToMultipleBy) -> (numberToIncrementByOne + 1) * numberToMultipleBy;

    static int incrementByOneAndMultiply(int number, int numToMultipleBy){
        return (number+1) * numToMultipleBy;
    }


}
