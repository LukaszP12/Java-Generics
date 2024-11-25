package com.baeldung;

import java.util.Optional;

class GenericsDemo14 {

    record User(String uid, String name, boolean ceo) {
    }

    public class UserFactory {
        public static Optional<User> getUser(String uid) {
            User user = null;

            // logic to set user

            return Optional.ofNullable(user);
        }
    }

    // Optional type is meant only as a Return type
    // and not as a method parameter or a member of
    // a class

    public static void main(String[] args) {
        Optional<User> optUser = UserFactory.getUser("Lucas");
        if (optUser.isPresent()){

            // process User. It's not empty
            String firstName = optUser.get().name();
        }
    }
}
