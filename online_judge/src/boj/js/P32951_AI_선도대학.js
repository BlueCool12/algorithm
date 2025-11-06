const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const START = 2024;
const N = +input;

console.log(N - START);