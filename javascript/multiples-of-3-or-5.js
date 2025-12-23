// Create a function that returns the sum of all the multiples of 3 or 5 below the number passed in.
// For example, if the number is 10, the multiples of 3 or 5 below 10 are 3, 5, 6, and 9. The sum of these multiples is 23.
// If the number passed in is less than 0, the function should return 0.

// My solution
function solution (number) {
    if (number < 0) {
        return 0;
    }
    let sum = 0;
    for (let i = 0; i < number; i++) {
        if (i % 3 === 0 || i % 5 === 0) {
            sum += i;
        }
    }
    return sum;
}