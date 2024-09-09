
const Rx = require('rxjs');


const doorStream = new Rx.Subject();
// Subject
class Door {
    open() {
        console.log('Door is open');
        doorStream.next({ type: 'open', doorNumber: 1, floorNumber: 2 });
    }
    close() {
        console.log('Door is closed');
        doorStream.next({ type: 'close', doorNumber: 1, floorNumber: 2 });
    }
}

// Observer ( Light )
doorStream.subscribe(event => {
    if (event.type === 'open') {
        console.log(`Light is on at ${event.floorNumber} floor and ${event.doorNumber} door`);
    } else {
        console.log(`Light is off at ${event.floorNumber} floor and ${event.doorNumber} door`);
    }
});

// Observer ( AC )
doorStream.subscribe(event => {
    if (event.type === 'open') {
        console.log(`AC is on at ${event.floorNumber} floor and ${event.doorNumber} door`);
    } else {
        console.log(`AC is off at ${event.floorNumber} floor and ${event.doorNumber} door`);
    }
});


const door = new Door();

setTimeout(() => {
    door.open();
    setTimeout(() => {
        door.close();
    }, 2000);
}, 2000);