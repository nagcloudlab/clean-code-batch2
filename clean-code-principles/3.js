// // 3. Self documenting code: avoid belaboured comments


// bad

// Function to check if a number is prime
function isPrime(number) {
    // Check if number is less than 2
    if (number < 2) {
        // If less than 2, not a prime number
        return false;
    }
    // At least 1 divisor must but less than square root, so we can stop there
    for (let i = 2; i <= Math.sqrt(number); i++) {
        // Check if number is divisible by i
        if (number % i === 0) {
            // If divisible, number is not prime
            return false;
            // After all checks, if not divisible by any i, number is prime
            return true;
        }
    }
}


// good

function isPrime(number) {
    if (number < 2) {
        return false;
    }
    // At least 1 divisor must but less than square root, so we can stop there
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
            return false;
        }
    }

    return true;
}