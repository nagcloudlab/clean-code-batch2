
//---------------------------------------
// Wheel abstration
//---------------------------------------

interface Wheel {
    rotate(): void;
}

//---------------------------------------
// MRFWheel module
//---------------------------------------

class MRFWheel implements Wheel {
    constructor() {
        console.log('MRFWheel instance created...');
    }
    rotate() {
        console.log('MRFWheel rotating...');
    }
}

//---------------------------------------
// CEATWheel module
//---------------------------------------

class CEATWheel implements Wheel {
    constructor() {
        console.log('CEATWheel instance created...');
    }
    rotate() {
        console.log('CEATWheel rotating...');
    }
}

//---------------------------------------
// car module
//---------------------------------------

// SINGLE RESPONSIBILITY PRINCIPLE
// OPEN/CLOSED PRINCIPLE
// LISKOV SUBSTITUTION PRINCIPLE
// INTERFACE SEGREGATION PRINCIPLE
// DEPENDENCY INVERSION PRINCIPLE

class Car {
    // private wheel: Wheel;
    // constructor(wheel: Wheel) {
    //     this.wheel = wheel;
    //     console.log('Car instance created...');
    // }
    constructor(private wheel: Wheel) {
        console.log('Car instance created...');
    }
    setWheel(wheel: Wheel) {
        this.wheel = wheel;
    }
    move() {
        //let wheel = new MRFWheel();
        this.wheel.rotate();
        console.log('Car moving...');
    }
}


//---------------------------------------

let car = new Car(new MRFWheel());
console.log();
car.move();
console.log();
car.move();
console.log();
car.setWheel(new CEATWheel());
console.log();
car.move();
//---------------------------------------
