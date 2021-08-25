package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    /*
     *Function<T> Represents a function that accepts one argument and produces a result
     *apply() method accepts the argument and executes the  function
     */

    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        System.out.println(
                incrementByOneAndMultiply(4, 100)
        );

        System.out.println(
                incrementByOneAndMultiplyFunction.apply(4,100)
        );
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    /* Represents a function that accepts two arguments and produces a result.
        BiFunction: takes 2 arguments and  produces 1 result
    */

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int multiplyBy) {
        return (number + 1) * multiplyBy;
    }
}
