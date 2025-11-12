
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;

const [N, M] = input[line++].split(' ').map(Number);
const S = input[line++].split(' ').map(Number);

for (let i = S.length; i < N + M; i++) S.push(0);

const total = input.length - line;
for (let i = 0; i < total; i++) {
    const T = input[line++].split(' ').map(Number);
    for (let j = 0; j < T.length; j++) {
        S[i] -= T[j];
        S[j] += T[j];
    }
}

console.log(S.join(' '));