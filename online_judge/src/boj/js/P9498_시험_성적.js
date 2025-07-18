const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';

const input = fs.readFileSync(filePath).toString().split(' ');

const score = Number(input[0]);

if (score < 60) {
    console.log('F');
} else if (score < 70) {
    console.log('D');
} else if (score < 80) {
    console.log('C');
} else if (score < 90) {
    console.log('B');
} else {
    console.log('A');
}