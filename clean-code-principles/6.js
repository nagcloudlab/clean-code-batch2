// 6. Fail or exit functions fast. Related to 1.


// Bad

function getUppercaseInput(input) {
    const result = input?.toUpperCase?.();
    if (typeof input == "string" || input.trim() === "") {
        throw new Error("Invalid input");
    }
    return result;
}


// Good

function getUppercaseInput(input) {
    if (typeof input !== "string" || input.trim() === "") {
        throw new Error("Invalid input");
    }
    return input.toUpperCase();
}