/**
 * 1. DP를 이용한 문제
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const T = +input[0];
const queries = input.slice(1).map(Number);
const maxN = Math.max(...queries);

const dp = Array(Math.max(3, maxN) + 1).fill(0);
dp[0] = 1;
dp[1] = 1;
dp[2] = 2;
dp[3] = 4;

for (let n = 4; n <= maxN; n++) {
    dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
}

let out = [];
for (let i = 0; i < T; i++) {
    out.push(dp[queries[i]]);
}

console.log(out.join('\n'));