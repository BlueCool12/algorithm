/**
 * 1. DP를 이용한 문제
 * 2. 맨 오른쪽에 세로로 타일을 놓는 경우와 가로로 타일을 놓는 경우의 수를 더함
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const n = +input;
const dp = new Array(n + 1).fill(0);

dp[1] = 1;
dp[2] = 2;

for (let i = 3; i < dp.length; i++) {
    dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
}

console.log(dp[n]);