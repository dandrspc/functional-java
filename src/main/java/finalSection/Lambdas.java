package finalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        // One argument and return immediately
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        System.out.println(toUpperCase.apply("daniel"));

        // One argument with some login
        Function<String, String> toUpperCase2 = name -> {
            // logic
            if (name.isBlank()) throw new IllegalStateException("");
            return name.toUpperCase();
        };

        // BiFunction
        BiFunction<String, Integer, String> toUpperCase3 = (name, age) -> {
            // logic
            if (name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(toUpperCase3.apply("Daniel", 31));
    }
}
