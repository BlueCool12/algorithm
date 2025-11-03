
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const P = 5 * +input - 400;

console.log(P);
console.log(P > 100 ? -1 : P === 100 ? 0 : 1);