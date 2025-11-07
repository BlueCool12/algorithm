
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = Number(input[0]);
const word = input[1];

const matches = word.match(/\d+/g);

let sum = 0;

if (matches) {
    for (const value of matches) sum += Number(value);
}

console.log(sum);