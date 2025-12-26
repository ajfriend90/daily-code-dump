// Find the integer that appears an odd number of times in an array

function findOdd(A) {
    const counts = {};
    for (const num of A) {
        counts[num] = (counts[num] || 0) + 1;
    }
    for (const [num, count] of Object.entries(counts)) {
        if (count % 2 === 1) {
            return Number(num);
        }
    }
}