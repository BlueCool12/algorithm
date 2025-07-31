/**
 * 1. (a - b) * (day - 1) + a >= v
 * 2. day >= v - a / (a - b) + 1
 * 3. day >= (v - a) / (a - b) + (a - b) / (a - b)
 * 4. day >= (v - a + a - b) / (a - b)
 * 5. day >= (v - b) / (a - b)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ').map(Number);

const a = input[0];
const b = input[1];
const v = input[2];

let day = Math.ceil((v - b) / (a - b));

console.log(day);