package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");

        System.out.println(value);

        String value2 = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("Exception"));
        System.out.println(value2);

        Optional.ofNullable("dapalca@gmail.com")
                .ifPresent(
                        email -> System.out.println("Sending email to Daniel")
                );
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to Daniel"),
                        () -> System.out.println("Cannot send email")
                );

    }
}
