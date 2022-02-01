package functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        Consumer<Integer> addC = i -> System.out.println(Value.counterC += i);
        Consumer<Integer> showC = i -> System.out.println(i);
        addC.andThen(showC).accept(1);


        Function<Integer,Integer> addF = i -> Value.counterF +=i;
        Function<Integer,Integer> showF = i -> {
            System.out.println(i); return  i;
        };
        addF.andThen(showF).apply(1);

    }
}

class Value{
    static Integer counterC = 1;
    static Integer counterF = 1;
}
