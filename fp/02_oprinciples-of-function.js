

/*
    principles of function

    1. Function is a first class citizen
        - Function can be assigned to a variable
        - Function can be passed as an argument to another function
        - Function can be returned from another function
    2. Pure function
    3. Higher order function
    4. Closure
    5. Currying
    6. Partial application
    7. Memoization
    8. Recursion

*/


// 1. Function can be assigned to a variable

// function greet() {
//     console.log('Hello');
// }

// let sayHello = greet;
// sayHello();

// 2. Function can be passed as an argument to another function

function greet(f) {
    console.log("🌸🌸🌸🌸🌸🌸🌸🌸");
    if (f) {
        f();
    } else {
        console.log("hello");
    }
    console.log("🌸🌸🌸🌸🌸🌸🌸🌸");
}

// default greet
//greet();

// by time, greet like GM, GA, GE, GN, etc

function timeBasedGreet() {
    let hours = new Date().getHours();
    if (hours < 12) {
        console.log("GM");
    } else if (hours < 16) {
        console.log("GA");
    } else if (hours < 20) {
        console.log("GE");
    } else {
        console.log("GN");
    }
}
greet(timeBasedGreet);

// e.g

let numbers = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
const ascending = (a, b) => a - b;
numbers.sort(ascending);
console.log(numbers);


// 3. Function can be returned from another function

function teach() {
    console.log("teach");
    function learn() {
        console.log("learn");
    }
    return learn;
}

const learn = teach();
learn();

//---------------------------------------


// 2. Pure function
// - Given the same input, the function will always return the same output
// - Produces no side effects

// why we need pure function?
// - Predictable
// - Testable
// - easy to debug
// - works well with concurrency


// e.g
function add(x, y) {
    return x + y;
}

console.log(add(12, 13)); // 25
console.log(add(12, 13)); // 25




// 3. Higher order function

// - A function that takes a function as an argument or returns a function


// e.g

function greet() {
    console.log("Hello");
}
function greetMorning(f) {
    console.log("Good Morning");
    f();
}
greetMorning(greet);




// 4. Closure
// A closure is a function having access to the parent scope, even after the parent function has closed.
function teach(sub) {
    console.log(`teaching ${sub}`);
    let notes = `${sub}-notes`;
    function learn() {
        console.log(`learning with ${notes}`);
    }
    //learn();
    console.log("teaching ends");
    return learn;
}

let learnFunc = teach("js");
learnFunc();