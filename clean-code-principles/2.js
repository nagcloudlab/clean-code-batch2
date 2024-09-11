
// 2. Ambiguous definitions: ‘is’ function prefix to denote boolean return

// Bad

const MIN_PASSWORD = 4;

function checkPasswordLength(password) {
    return password.length >= MIN_PASSWORD;
}


// Good

const MIN_PASSWORD_LENGTH = 4;
function isPasswordLongEnough(password) {
    return password.length >= MIN_PASSWORD_LENGTH;
}