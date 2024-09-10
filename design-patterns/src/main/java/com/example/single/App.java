package com.example.single;

// // Eager initialization
//class Single {
//    private static Single instance = new Single();
//    private Single() {
//        System.out.println("Single instance created");
//    }
//    public static Single getInstance() {
//        return instance;
//    }
//}

// // Lazy initialization
//class Single {
//    private static Single instance = null;
//    private Single() {
//        System.out.println("Single instance created");
//    }
//    public static Single getInstance() {
//        if (instance == null) {
//            instance = new Single();
//        }
//        return instance;
//    }
//}

//  // Thread safe lazy initialization
class Single {
    private static Single instance = null;
    private Single() {
        System.out.println("Single instance created");
    }
    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}

public class App {

    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);
    }

}
