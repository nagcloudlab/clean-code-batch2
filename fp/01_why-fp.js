

//---------------------------------------
// Why Functional Programming?
//---------------------------------------


const inventory = [
    { color: "red", weight: 70 },
    { color: "red", weight: 150 },
    { color: "green", weight: 50 },
]


// client: farmer

//---------------------------------------
// Req-1: filter all red apples in inventory
//---------------------------------------
const intention = (apple) => apple.color === 'red'

console.log(
    //filterRedApples(inventory)
    //filterApplesByColor(inventory, 'red')
    //filterApples(inventory, 'red', undefined)
    filterApples(inventory, intention)
);

//---------------------------------------
// Req-2: filter all green apples in inventory
//---------------------------------------
console.log(
    // filterGreenApples(inventory)
    // filterApplesByColor(inventory, 'green')
    // filterApples(inventory, 'green', undefined)
    filterApples(inventory, (apple) => apple.color === 'green')
);

//---------------------------------------
// Req-3: filter all apples by weight
//---------------------------------------
console.log(
    //filterApplesByWeight(inventory, 70)
    //filterApples(inventory, undefined, 70)
    filterApples(inventory, (apple) => apple.weight === 70)
);

//---------------------------------------
// Req-4: filter all red apples by weight
//---------------------------------------

console.log(
    filterApples(inventory, (apple) => apple.color === 'red' && apple.weight === 70)
);


//---------------------------------------
// declarative style: 
// separating intention ( What) & implementation ( How )
//---------------------------------------

// declarative style:  with function  => functional programming

// 2. by function params
function filterApples(inventory, f) {
    const filterApples = [];
    for (let i = 0; i < inventory.length; i++) {
        if (f(inventory[i])) {
            filterApples.push(inventory[i]);
        }
    }
    return filterApples;
}


// 1. by primitive params

// function filterApples(inventory, color, weight) {
//     const filterApples = [];
//     for (let i = 0; i < inventory.length; i++) {
//         if (color != undefined) {
//             if (inventory[i].color === color) {
//                 filterApples.push(inventory[i]);
//             }
//         }
//         else if (weight != undefined) {
//             if (inventory[i].weight === weight) {
//                 filterApples.push(inventory[i]);
//             }
//         }
//         else if (color != undefined && weight != undefined) {
//             if (inventory[i].color === color && inventory[i].weight === weight) {
//                 filterApples.push(inventory[i]);
//             }
//         }
//     }
//     return filterApples;
// }

// function filterApplesByColor(inventory, color) {
//     const filterApples = [];
//     for (let i = 0; i < inventory.length; i++) {
//         if (inventory[i].color === color) {
//             filterApples.push(inventory[i]);
//         }
//     }
//     return filterApples;
// }

// function filterApplesByWeight(inventory, weight) {
//     const filterApples = [];
//     for (let i = 0; i < inventory.length; i++) {
//         if (inventory[i].weight === weight) {
//             filterApples.push(inventory[i]);
//         }
//     }
//     return filterApples;
// }

//---------------------------------------
// imperative style: // solving problem step by step 
// intention ( What) & implementation ( How ) are mixed
//---------------------------------------

// function filterRedApples(inventory) {
//     const filterRedApples = [];
//     for (let i = 0; i < inventory.length; i++) {
//         if (inventory[i].color === 'red') {
//             filterRedApples.push(inventory[i]);
//         }
//     }
//     return filterRedApples;
// }

// function filterGreenApples(inventory) {
//     const filterGreenApples = [];
//     for (let i = 0; i < inventory.length; i++) {
//         if (inventory[i].color === 'green') {
//             filterGreenApples.push(inventory[i]);
//         }
//     }
//     return filterGreenApples;
// }

//---------------------------------------