// Write a function that takes in a string of one or more words, and returns
// the same string, but with all five-letter words reversed.

function spinWords(str) {
    let words = str.split(' ');
    let result = words.map(word => {
        if (word.length >= 5) {
            return word.split('').reverse().join('');
        } else {
            return word;
        }
    });
    return result.join(' ');
}