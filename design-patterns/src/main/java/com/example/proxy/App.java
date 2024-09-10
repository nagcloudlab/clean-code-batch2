package com.example.proxy;

/*
    design issues
    ---------------
    -> code tangling / tight coupling ( Mix of concerns )
    -> code scattering / duplication ( DRY principle violation )

 */


// SRP - Single Responsibility Principle
class Trainer{
    public String getTopic1(){
//        // authorization logic
//        System.out.println("Authorization logic");
//        // logging logic
//        System.out.println("Logging logic");
        return "Topic 1";
    }
    public String getTopic2(){
//        // authorization logic
//        System.out.println("Authorization logic");
//        // logging logic
//        System.out.println("Logging logic");
        return "Topic 2";
    }
}


class Authorization{
    public void check(){
        System.out.println("Authorization logic");
    }
}

class Logging{
    public void log(){
        System.out.println("Logging logic");
    }
}

// OCP - Open for extension , closed for modification
class TrainerProxy{

    private Authorization authorization = new Authorization();
    private Logging logging = new Logging();
    private Trainer trainer = new Trainer(); // Wrapping / Composition

    public String getTopic1(){
        // authorization logic
        authorization.check();
        // logging logic
        logging.log();
        return trainer.getTopic1();
    }
    public String getTopic2(){
        // authorization logic
        System.out.println("Authorization logic");
        // logging logic
        System.out.println("Logging logic");
        return trainer.getTopic2();
    }
}


public class App {
    public static void main(String[] args) {


        //-----------------------------------------
        // Client , Without Proxy
        //-----------------------------------------
//
//        Trainer trainer = new Trainer();
//
//        String topic1 = trainer.getTopic1();
//        System.out.println(topic1);
//
//        String topic2 = trainer.getTopic2();
//        System.out.println(topic2);

        //-----------------------------------------
        // Client , With Proxy
        //-----------------------------------------

        TrainerProxy trainerProxy = new TrainerProxy();

        String topic1 = trainerProxy.getTopic1();
        System.out.println(topic1);

        String topic2 = trainerProxy.getTopic2();
        System.out.println(topic2);

    }
}
