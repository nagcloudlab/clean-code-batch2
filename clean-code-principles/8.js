

// // 8. Avoid violating single responsibility. Prefer to use pure functions (no side effects)


// Bad

// let area = 0;
// function calculateAndUpdateArea(radius) {
//     const newArea = Math.PI * radius * radius;
//     area = newArea; // Side effect
//     return newArea;
// }


// Good

function calculateArea(radius) {
    return Math.PI * radius * radius;
}
const area = calculateArea(5);