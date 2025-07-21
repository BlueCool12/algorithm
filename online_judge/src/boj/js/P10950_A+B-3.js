const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const t = Number(input[0]);

for (let i = 0; i < t; i++) {
    const a = input[i + 1].split(' ')[0];
    const b = input[i + 1].split(' ')[1];

    console.log(Number(a) + Number(b));
}