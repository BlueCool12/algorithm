const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const A = input[0].split(' ').map(Number);
const B = input[1].split(' ').map(Number);

let scoreA = 0;
let scoreB = 0;
let finalWin = 'D';
for (let i = 0; i < 10; i++) {
    if (A[i] > B[i]) {
        scoreA += 3;
        finalWin = 'A';
    } else if (B[i] > A[i]) {
        scoreB += 3;
        finalWin = 'B';
    } else {
        scoreA++;
        scoreB++;
    }
}

console.log(`${scoreA} ${scoreB}`);

if (scoreA === scoreB) {
    console.log(finalWin);
} else {
    console.log(scoreA > scoreB ? 'A' : 'B');
}