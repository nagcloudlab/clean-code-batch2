//---------------------------------------
// Wheel abstration
//---------------------------------------
//---------------------------------------
// MRFWheel module
//---------------------------------------
var MRFWheel = /** @class */ (function () {
    function MRFWheel() {
        console.log('MRFWheel instance created...');
    }
    MRFWheel.prototype.rotate = function () {
        console.log('MRFWheel rotating...');
    };
    return MRFWheel;
}());
//---------------------------------------
// CEATWheel module
//---------------------------------------
var CEATWheel = /** @class */ (function () {
    function CEATWheel() {
        console.log('CEATWheel instance created...');
    }
    CEATWheel.prototype.rotate = function () {
        console.log('CEATWheel rotating...');
    };
    return CEATWheel;
}());
//---------------------------------------
// car module
//---------------------------------------
// SINGLE RESPONSIBILITY PRINCIPLE
// OPEN/CLOSED PRINCIPLE
// LISKOV SUBSTITUTION PRINCIPLE
// INTERFACE SEGREGATION PRINCIPLE
// DEPENDENCY INVERSION PRINCIPLE
var Car = /** @class */ (function () {
    // private wheel: Wheel;
    // constructor(wheel: Wheel) {
    //     this.wheel = wheel;
    //     console.log('Car instance created...');
    // }
    function Car(wheel) {
        this.wheel = wheel;
        console.log('Car instance created...');
    }
    Car.prototype.setWheel = function (wheel) {
        this.wheel = wheel;
    };
    Car.prototype.move = function () {
        //let wheel = new MRFWheel();
        this.wheel.rotate();
        console.log('Car moving...');
    };
    return Car;
}());
//---------------------------------------
var car = new Car(new MRFWheel());
console.log();
car.move();
console.log();
car.move();
console.log();
car.setWheel(new CEATWheel());
console.log();
car.move();
//---------------------------------------
