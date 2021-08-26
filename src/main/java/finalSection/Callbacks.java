package finalSection;

import java.util.function.Consumer;
import java.util.function.Function;

public class Callbacks {
    public static void main(String[] args) {
        hello("Daniel", null, value -> {
            System.out.println("No lastname provided for " + value);
        });

        hello2("Daniel",
                null,
                () -> System.out.println("No lastname provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

//    function hello (firstName, lastName, callback){
//        console.log(firstName);
//        if(lastName) {
//            console.log(lastname);
//        }else{
//            callback();
//        }
//    }
}
