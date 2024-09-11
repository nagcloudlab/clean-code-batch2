


java,javascript/typescript naming conventions
---------------------------------------------

keywords => lower-case
package names => lower-case
Type Names => UpperCamelCase (PascalCase)  e.g Account, AccountBuilder
Method Names => lowerCamelCase e.g. getAccount, setAccount
Variable Names => lowerCamelCase e.g. account
Constant Names => UPPER_CASE e.g. ACCOUNT




List<Customer> customer=new ArrayList<Customer>(); //bad
List<Customer> customers=new ArrayList<Customer>(); //good



---------------------------------------------------

One Level of Abstraction per Function

Functions should do one thing. They should do it well. They should do it only.




fuction f1(){
    f2()
}

function f2(){
    
}