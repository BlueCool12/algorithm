
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim().split(' ').map(Number);

const N = ((input[0] + 1) * (input[1] + 1) / (input[2] + 1)) - 1;
console.log(Math.floor(N));