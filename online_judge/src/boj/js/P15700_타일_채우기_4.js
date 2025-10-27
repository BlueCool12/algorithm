const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const tile = input.split(' ').map(BigInt)

console.log(String((tile[0] * tile[1]) / 2n))