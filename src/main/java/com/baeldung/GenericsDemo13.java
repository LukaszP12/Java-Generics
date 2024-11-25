package com.baeldung;

class GenericsDemo13 {
    interface X {
        void x();
    }

    interface Y {
        void y();
    }

    // Both B and C use X and Y
    interface B extends X, Y {
        void b();
    }

    interface C extends X,Y{
        void c();
    }

//    var result = switch(city){
//        case "New York" -> new B() {};
//        default -> new C(){};
//    };
}
