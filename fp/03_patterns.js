

//-------------------------------
// Factory Pattern
//-------------------------------

class Circle {
    constructor() {
        this.type = 'circle';
    }
}
class Square {
    constructor() {
        this.type = 'square';
    }

}
class Rectangle {
    constructor() {
        this.type = 'rectangle';
    }
}

function shapeFactory(shape) {
    if (shape === 'circle') {
        return new Circle();
    } else if (shape === 'square') {
        return new Square();
    } else if (shape === 'rectangle') {
        return new Rectangle();
    } else {
        return null;
    }
}

const circle = shapeFactory('circle');


//-------------------------------
// Strategy Pattern
//-------------------------------

// strategy functions
const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
const multiply = (a, b) => a * b;

// context function that uses strategy
function calculate(strategy, a, b) {
    return strategy(a, b);
}

console.log(calculate(add, 10, 5)); // 15
console.log(calculate(subtract, 10, 5)); // 5
console.log(calculate(multiply, 10, 5)); // 50


//-------------------------------
// Decorator Pattern ( composition )
//-------------------------------

// Original function
function hello() {
    console.log("hello");
}

// Decorator function to emoji behavior
function emojiDecorator(f) {
    return function () {
        f();
        console.log("😊😊😊😊😊😊😊😊😊");
    }
}

// Decorated function
const helloWithEmoji = emojiDecorator(hello);
helloWithEmoji();


//-------------------------------
// Observer Pattern
//-------------------------------


// List of observers
let observers = [];

// Add observer function ( subscribe )
function addObserver(fn) {
    observers.push(fn);
}

// Remove observer function ( unsubscribe )
function removeObserver(fn) {
    observers = observers.filter(o => o !== fn);
}

// Notify observers function
function notifyObservers(message) {
    observers.forEach(o => o(message));
}


// Observer functions
const logger = (msg) => console.log(`Logger: ${msg}`);
const notifier = (msg) => console.log(`Notifier: ${msg}`);

// Add observers
addObserver(logger);
addObserver(notifier);

// Notify observers
notifyObservers("Event Happened");


//-------------------------------
// Chain of Responsibility Pattern
//-------------------------------

const handler1 = (msg, next) => {
    if (msg === "task1") {
        console.log("Handler1 is handling task1");
    } else {
        next(msg);
    }
}

const handler2 = (msg, next) => {
    if (msg === "task2") {
        console.log("Handler2 is handling task2");
    } else {
        next(msg);
    }
}

const defaultHandler = (msg) => {
    console.log(`No handler found for ${msg}`);
}

// chain the handlers
function processMessage(msg) {
    handler1(msg, (msg) => {
        handler2(msg, defaultHandler);
    });
}

processMessage("task1");
processMessage("task2");
processMessage("task3");



//-------------------------------
// Memoization Pattern
//-------------------------------

function memoize(fn) {
    const cache = {};
    return (...args) => {
        const key = JSON.stringify(args);
        if (cache[key]) {
            return cache[key];
        } else {
            const result = fn(...args);
            cache[key] = result;
            return result;
        }
    };
}


// Expensive function
const slowFunction = (num) => {
    console.log('Computing...');
    return num * num;
};

const fastFunction = memoize(slowFunction);

console.log(fastFunction(10)); // Computing... 100
console.log(fastFunction(10)); // 100
console.log(fastFunction(5)); // Computing... 25
console.log(fastFunction(5)); // 25


//-------------------------------
// Singleton Pattern
//-------------------------------

// self-invoking function
// iife (immediately invoked function expression)

const counter = (function initCounter() {
    console.log('init');
    let count = 0
    return {
        increment: () => count++,
        getCount: () => count
    }
})()

counter.increment();
counter.increment();
console.log(counter.getCount()); // 2