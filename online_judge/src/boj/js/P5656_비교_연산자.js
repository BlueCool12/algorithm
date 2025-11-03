
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

for (let i = 0; i < input.length; i++) {
    const line = input[i].trim().split(' ');

    const a = Number(line[0]);
    const b = Number(line[2]);

    if (line[1] === '>') {
        console.log(`Case ${i + 1}: ${a > b}`);
    } else if (line[1] === '>=') {
        console.log(`Case ${i + 1}: ${a >= b}`);
    } else if (line[1] === '<') {
        console.log(`Case ${i + 1}: ${a < b}`);
    } else if (line[1] === '<=') {
        console.log(`Case ${i + 1}: ${a <= b}`);
    } else if (line[1] === '==') {
        console.log(`Case ${i + 1}: ${a == b}`);
    } else if (line[1] === '!=') {
        console.log(`Case ${i + 1}: ${a != b}`);
    } else {
        return;
    }
}