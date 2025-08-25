/**
 * 1. DP를 이용한 문제
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim().split('\n').map(Number);

const N = +input[0];
const stairs = input;

const dp = new Array(stairs.length + 1).fill(-1);
dp[1] = stairs[1];
dp[2] = stairs[1] + stairs[2];
dp[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);

for (let i = 4; i <= stairs.length; i++) {
    dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
}

console.log(dp[N]);