

// design issues
// ----------------------------
// code tangling (mixing of concerns)
// code scattering (same code in multiple places)

// solution:
// ----------------------------

// / object oriented programming - proxy pattern
// / functional programming - higher order functions

// Higher Order Functions
// ----------------------------
// Functions that operate on other functions, 
// either by taking them as arguments or by returning them, 
// are called higher-order functions.



/// SRP - Single Responsibility Principle
function hi() {
    console.log('hi');
}
function hello() {
    console.log('hello');
}
function helloWithoutSmile() {
    console.log('hello');
}

// HOF -> by composition multiple functions, build a new function
function withEmoji(f) {
    return function () {
        console.log('😊');
        f();
        console.log('😊');
    }
}

let hiWithEmoji = withEmoji(hi);
hiWithEmoji();
let helloWithEmoji = withEmoji(hello);
helloWithEmoji();
hello()