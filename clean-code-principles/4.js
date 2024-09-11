// 4. Consistent formatting. Use Eslint + Prettier to automate code style


// Bad

// const name = "Conner";
// let age=26;

//  function getUserInfo() {
// console.log("User Info:");
//       console.log('Name:'+ name);
//      console.log (`Age: $ age}`);
//  }


// Good


const name = "Conner";
let age = 26;

function getUserInfo() {
    console.log("User Info:");
    console.log(`Name:" + ${name}`);
    console.log(`Age: ${age}`);
}