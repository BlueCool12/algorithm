const fs = require('fs');

const input = require('fs').readFileSync(0).toString().trim().split("\n");
// const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const year = Number(input[0]);

if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
    console.log(1);
} else {
    console.log(0);
}