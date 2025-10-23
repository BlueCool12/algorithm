const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const n = input

if (n.includes('7')) {
    console.log(Number(n) % 7 === 0 ? '3' : '2');
} else {
    console.log(Number(n) % 7 === 0 ? '1' : '0');
}