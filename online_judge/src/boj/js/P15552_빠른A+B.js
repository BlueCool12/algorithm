const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const t = Number(input[0]);

let answer = '';
for (let i = 0; i < t; i++) {
    const [a, b] = input[i + 1].split(' ').map(Number);
    answer += (a + b) + '\n';
}

console.log(answer);