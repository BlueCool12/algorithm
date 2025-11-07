
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;
const TESTS = +input[line++];

for (let i = 0; i < TESTS; i++) {
    const AB = input[line++].split(' ').map(Number);

    console.log((AB[0] * AB[0]) / (AB[1] * AB[1]));
}