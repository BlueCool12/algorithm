
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = input[0];

const Carlos = Number(input[1]);

let isElected = true;
for (let i = 2; i <= N; i++) {
    if (Number(input[i]) > Carlos) {
        isElected = false;
        break;
    }
}

console.log(isElected ? "S" : "N");