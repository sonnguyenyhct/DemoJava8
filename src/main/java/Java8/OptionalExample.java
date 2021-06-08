package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User{
    private Address address;
    public Address getAddress() {
        return address;
    }
}
class Address{
    private String street;
    public String getStreet(){
        return street;
    };
}

public class OptionalExample {
    public static void main(String[] args) {
//        List<String> listOpt2 = getList2().orElseGet(() -> new ArrayList<>());
        List<String> listOpt2 = getList2().orElseGet(ArrayList::new);


    }

    private static List<String> getList(){
        return null;
    };
    private static Optional<List<String>> getList2(){
        return Optional.empty();
    }

    public String getStreetJava8(){
        Optional<User> user = Optional.ofNullable(getUser());
        return user.map(User::getAddress)
                .map(Address::getStreet)
                .orElse("not specified");
    }
    private static User getUser(){
        return null;
    }


}
