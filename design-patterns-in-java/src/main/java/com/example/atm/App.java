package com.example.atm;


/*
pattern : Chain of Responsibility Pattern
 */

abstract class Handler{
    protected Handler nextHandler;
    public Handler setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }
    public abstract void handleRequest(int amount);
}

// SCP : Single Responsibility Principle
class ATMHandler extends Handler{
    private int denomination;
    public ATMHandler(int denomination){
        this.denomination = denomination;
    }
    public void handleRequest(int amount){
        int notes = amount / denomination;
        int remainingAmount = amount % denomination;
        if(notes > 0){
            System.out.println(denomination + " * " + notes + " = " + (denomination * notes));
        }
        if (remainingAmount > 0 && nextHandler != null) {
            nextHandler.handleRequest(remainingAmount);
        }
    }
}

public class App {
    public static void main(String[] args) {

        Handler handler50=new ATMHandler(50);
        Handler handler100=new ATMHandler(100);
        Handler handler500=new ATMHandler(500);

        // OCD : Open Closed Principle
        // 500 -> 100 -> 50
        handler500.setNextHandler(handler100).setNextHandler(handler50);

        //-------------------------

        handler500.handleRequest(2000);
        System.out.println("=====================================");
        handler500.handleRequest(2200);
        System.out.println("=====================================");
        handler500.handleRequest(2750);

    }
}
