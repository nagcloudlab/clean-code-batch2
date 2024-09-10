

// Subject
class Door {
    listeners = [];
    addListener(listener) {
        this.listeners.push(listener);
    }

    removeListener(listener) {
        this.listeners = this.listeners.filter(l => l !== listener);
    }
    open() {
        console.log('Door is open');
        for (let listener of this.listeners) {
            listener.on({ type: 'open', doorNumber: 1, floorNumber: 2 }); // sync
        }
    }
    close() {
        console.log('Door is closed');
        for (let listener of this.listeners) {
            listener.off({ type: 'close', doorNumber: 1, floorNumber: 2 });
        }
    }
}

// Observer
class Light {
    on(event) {
        console.log(`Light is on at ${event.floorNumber} floor and ${event.doorNumber} door`);
    }
    off(event) {
        console.log(`Light is off at ${event.floorNumber} floor and ${event.doorNumber} door`);
    }
}

// Observer
class AC {
    on(event) {
        console.log(`AC is on at ${event.floorNumber} floor and ${event.doorNumber} door`);
    }
    off(event) {
        console.log(`AC is off at ${event.floorNumber} floor and ${event.doorNumber} door`);
    }
}

const door = new Door();
const light = new Light();
const ac = new AC();

door.addListener(light);
door.addListener(ac);


setTimeout(() => {
    door.open();
    setTimeout(() => {
        door.close();
    }, 2000);
}, 2000);