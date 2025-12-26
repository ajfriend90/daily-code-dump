// Implement a function that returns the difference between two arrays
// as a new array, containing elements that are in the first array but not in the second.

function arrayDiff(a, b) {
    return a.filter(item => !b.includes(item));
}