const fs = require('fs');
const input = require('fs').readFileSync(0).toString().trim().split(' ');
// const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

const n = Number(input[0]);

for (let i = 0; i < n; i++) {
    console.log(i + 1);
}