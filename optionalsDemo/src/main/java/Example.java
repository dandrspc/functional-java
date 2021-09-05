import java.util.Optional;

public class Example {
    public static void main(String[] args) {

        // empty()
        Optional<Object> empty = Optional.empty();
        System.out.println("===========================");
        System.out.println("Is present? " + empty.isPresent());
        System.out.println("Is empty? " + empty.isEmpty());

        // of()
        // If opt is instantiated as null we'll get a NullPointerException
        String opt = null;
        // Optional<String> hello = Optional.of(opt);

        // User ofNullable() to allow null values.
        Optional<String> hello = Optional.ofNullable("Hello");
        String orElse = hello
                .map(String::toUpperCase)
                .orElse("World");
        System.out.println("\n===========================");
        System.out.println(orElse);

        // orElseGet(Supplier())
        Optional<String> nullValue = Optional.ofNullable(null);
        String orElseGet = nullValue.orElseGet(() -> {
            // Extra computation if values is not null
            return "Computed Value";
        });
        System.out.println(orElseGet);

        String orElse_ = hello
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new);
        System.out.println(orElse_);

        System.out.println("\n===========================");
        System.out.println("If present");
        hello.ifPresent(System.out::println);


        System.out.println("\n===========================");
        System.out.println("If present Or Else");
        Optional<Object> word = Optional.ofNullable(null);
        word.ifPresentOrElse(System.out::println,() -> {System.out.println("Word");});
    }
}
