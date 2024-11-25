package com.baeldung;

// using Optional.stream()

import java.util.Optional;

import static com.baeldung.GenericsDemo14.User;

class GenericsDemo16 {

    public static void main(String[] args) {
        // Optional from a value which CANNOT be null
        User someUser = new User("123", "user1", true);
        Optional<User> optUser = Optional.of(someUser);
        // Optional from a value which CAN be null
        Optional<User> optUser1 = Optional.ofNullable(someUser);

        // Empty Optional
        Optional<User> optUser2 = Optional.empty();
    }
}
