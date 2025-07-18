const fs = require('fs');

const input = require('fs').readFileSync(0).toString().trim().split("\n");
// const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const x = Number(input[0]);
const y = Number(input[1]);

if (x > 0) {
    console.log(y > 0 ? 1 : 4);
} else {
    console.log(y > 0 ? 2 : 3);
}