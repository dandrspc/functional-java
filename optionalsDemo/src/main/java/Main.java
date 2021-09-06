import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Daniel", "DAPALCA@gmail.com");
        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("Email not provided");

        System.out.println(email);
    }
}

class Person {
    private final String name;
    private final String email;

    Person(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

