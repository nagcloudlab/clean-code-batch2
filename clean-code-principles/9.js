
// 9. Overly clever code (code golf). Leads to impenetrable single liners (have to rewrite in order to debug)


// bad

// const numbers = [1, 6, 8, 9, 10];
// const result = numbers.reduce(
//     ((acc, n) => (n & 1 ? [...acc, n * n] : acc), [])
// );
// console.log(result); // Output: [ 1, 9, 25, 49, 81 ]

// good


const numbers = [1, 6, 8, 9, 10];
const result = numbers.filter((n) => n & 1).map((n) => n * n);
console.log(result); // Output: [ 1, 9, 25, 49, 81 ]