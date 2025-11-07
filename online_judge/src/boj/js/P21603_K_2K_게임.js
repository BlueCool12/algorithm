
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

const N = Number(input[0]);
const K = Number(input[1]);

const d1 = K % 10;
const d2 = (K * 2) % 10;

const out = [];
for (let i = 1; i <= N; i++) {
    const last = i % 10;
    if (last !== d1 && last !== d2) out.push(i);
}

console.log(out.length);
console.log(out.join(' '));