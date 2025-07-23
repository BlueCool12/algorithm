const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

function calc(a, b) {
    return (a + b) * (a - b);
}

const a = Number(input[0]);
const b = Number(input[1]);
const answer = calc(a, b);

console.log(answer);