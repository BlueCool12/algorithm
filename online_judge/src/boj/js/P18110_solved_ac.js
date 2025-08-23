
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = +input[0];
if (n === 0) {
    console.log(0);
} else {
    const level = input.slice(1).map(Number);

    const avr = Math.round((level.length * 0.3) / 2);

    level.sort((a, b) => a - b);
    level.splice(0, avr);
    level.splice(level.length - avr, avr);

    let sum = 0;
    for (let i = 0; i < level.length; i++) {
        sum += level[i];
    }

    console.log(Math.round(sum / level.length));
}