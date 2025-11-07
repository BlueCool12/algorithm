
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = Number(input[0]);
const ANSWERS = input[1].split('');

let bonus = 0;
let score = 0;
for (let i = 1; i <= N; i++) {
    if (ANSWERS[i - 1] === 'O') {
        score += (i + bonus++);        
    } else if (ANSWERS[i - 1] === 'X') {
        bonus = 0;
    }
}

console.log(score);