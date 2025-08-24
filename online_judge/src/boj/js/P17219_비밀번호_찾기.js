/**
 * 1. 맵을 사용하여 풀이
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);

const map = new Map();
for (let i = 1; i <= N; i++) {
    const [website, password] = input[i].split(' ');
    map.set(website, password);
}

const out = [];
for (let i = N + 1; i <= N + M; i++) {
    out.push(map.get(input[i]));
}

console.log(out.join('\n'));