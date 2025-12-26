//scratch work

let A = [1, 1, 2, 2, 4, 3, 3];

let B;
for (const i of A) {
    if (!B.includes(i)) {
        B.push(i);

    }
}

console.log(B);