import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // empty()
        Optional<Object> empty = Optional.empty();

        System.out.println("Is present? "  + empty.isPresent());
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
        System.out.println(orElse);

        // orElseGet(Supplier())
        Optional<String> nullValue = Optional.ofNullable(null);
        String orElseGet = nullValue.orElseGet(() -> {
            // Extra computation if values is not null
            return "Computed Value";
        });

        System.out.println(orElseGet);

        Optional<String> hello_ = Optional.ofNullable("Hello");
        String orElse_ = hello_
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new);
        System.out.println(orElse_);

    }
}
