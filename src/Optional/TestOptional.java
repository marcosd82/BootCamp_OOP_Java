package Optional;

import java.util.Optional;

public class TestOptional {

    public static void main (String args[]){

        Optional<String> optional = Optional.of("hello world!!");
        if (optional.isPresent()){
            System.out.println(optional.get());
        }

    }
}
