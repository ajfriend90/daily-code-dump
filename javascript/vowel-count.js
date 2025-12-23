// Return the number (count) of vowels in the given string.

// My Solution
function getCount(str) {
    let count = 0;
    let vowels = ['a', 'e', 'i', 'o', 'u'];
    for (let i = 0; i < str.length; i++) {
        if (vowels.includes(str[i])) {
            count++;
        }
    }
    return count;
}

// Best Solution
function getCount(str) {
    return str.replace(/[^aeiou]/gi, '').length;
}