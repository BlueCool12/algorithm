
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const a = Number(input);

const c = 2 * Math.sqrt(Math.PI * a);

console.log(c);