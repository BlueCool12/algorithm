
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const S = input[0].trim();
const K = input[1].trim();

console.log(S.replace(/[0-9]/g, '').includes(K) ? 1 : 0);