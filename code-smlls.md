


 <!-- Self Encapsulate Field! -->


 ```javascript

const person={
    // data properties
    _name:'John',
    _age:30,
    // accessor properties
    get name(){
        return this._name
    },
    set name(value){
        this._name=value
    },
    get age(){
        return this._age
    },
    set age(value){
        if(value>0){
            this._age=value
        }else{
            console.log('Invalid value')
        }
    }
}

// write
person.name='Jane'
person.age=-1

// read
console.log(person.name)
console.log(person.age)


 ```


 <!-- Replace Magic Number with Constant! -->


 before

 ```javascript

function getArea(radius){
    return 3.14*radius*radius
}

 ```

 after

 ```javascript

const PI=3.14

function getArea(radius){
    return PI*radius*radius
}

 ```
 