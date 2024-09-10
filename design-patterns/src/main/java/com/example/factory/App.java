package com.example.factory;

// Factory Method Pattern
class DBConnectionFactory{
    public static String createConnection(String dbType){
        if(dbType.equals("sql-server")){
            return "sql-server connection";
        }else if(dbType.equals("oracle")){
            return "oracle connection";
        }
        throw new IllegalArgumentException("Invalid dbType");
    }
}


class Module1{
    public void method1(){
        System.out.println("Module1 method1");
        // we need db connection object ( to sql server)
        String connection = DBConnectionFactory.createConnection("sql-server");
        System.out.println(connection);
    }
}

class Module2{
    public void method2(){
        System.out.println("Module2 method2");
        // we need db connection object ( to oracle)
        String connection = DBConnectionFactory.createConnection("oracle");
        System.out.println(connection);
    }
}


public class App {
    public static void main(String[] args) {

        Module1 module1 = new Module1();
        module1.method1();

        Module2 module2 = new Module2();
        module2.method2();

    }
}
