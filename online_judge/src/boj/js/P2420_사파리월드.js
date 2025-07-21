const fs = require('fs');

// const input = require('fs').readFileSync(0).toString().trim().split(" ");
const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

const n = Number(input[0]);
const m = Number(input[1]);

console.log(Math.abs(n - m));