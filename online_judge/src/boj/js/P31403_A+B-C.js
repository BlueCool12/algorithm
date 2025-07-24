const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const a = Number(input[0]);
const b = input[1];
const c = input[2];

console.log(a + Number(b) - c);
console.log(a + b - Number(c))