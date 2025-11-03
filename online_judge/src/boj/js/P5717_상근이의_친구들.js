
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

input.forEach((line) => {
    const test = line.trim().split(' ').map(Number);

    if (test[0] === 0 && test[1] === 0) {
        return;
    }

    console.log(test[0] + test[1]);
});