
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const N = Number(input);

console.log(`${'long '.repeat(N / 4)}int`);