const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const arr = Array(32).fill(0);

let line = 0;

const N = Number(input[line++]);
for (let i = 0; i < N; i++) {
    const [start, end] = input[line++].split(' ').map(Number);
    for (let j = start; j < end; j++) {
        arr[j]++;
    }
}

const books = input[line];
let answer = 1;
arr.forEach((value) => {
    if (value > books) {
        answer = 0;
        return;
    }
})

console.log(answer);