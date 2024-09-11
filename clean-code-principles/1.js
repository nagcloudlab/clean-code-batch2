

//// 1. Eliminate if/else branching; early termination

// bad
function processUser(user) {
    if (user != null) {
        if (user.hasSubscription) {
            if (user.age >= 18) {
                showFullVersion();
            } else {
                showChildrenVersion();
            }
        } else {
            throw new Error("User needs to have a subscription");
        }
    } else {
        throw new Error("No user found");
    }
}

// good

function processUser(user) {
    if (user == null) throw new Error("No user found");
    if (!user.hasSubscription)
        throw new Error("User needs to have a subscription");

    if (user.age < 18) return showChildrenVersion();
    showFullVersion();
}

function showChildrenVersion() {
    // show children version
}

function showFullVersion() {
    // show full version
}