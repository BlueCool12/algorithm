const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';

const input = fs.readFileSync(filePath).toString().split(' ');

const a = Number(input[0]);
const b = Number(input[1]);

if (a === b) {
    console.log('==');
} else {
    a > b ? console.log('>') : console.log('<');
}