const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const T = input[0];

for (let i = 1; i <= T; i++) {
    const [x, y] = input[i].split(' ').map(Number);
    const answer = x + y;
    console.log(answer === 1 ? 2 : 1);
}