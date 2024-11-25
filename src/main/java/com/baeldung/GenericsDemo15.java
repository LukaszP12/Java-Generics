package com.baeldung;

import java.util.Optional;

import static com.baeldung.GenericsDemo14.*;

class GenericsDemo15 {

    public static void handleUser(User u) {
        String name = u.name();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Optional<User> oUser = Users.getUser("Lucas");
        oUser.ifPresent(user -> {
            String name = user.name();
            System.out.println(name);
        });

        User user = oUser.orElseGet(() -> new User("123", "dummyUser", true));
        System.out.println("user.name(): " + user.name());

        Optional<User> oUser1 = Users.getUser("Lucas");
        oUser1.ifPresent(GenericsDemo15::handleUser);
    }
}
