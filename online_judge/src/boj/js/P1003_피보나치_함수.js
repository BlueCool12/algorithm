/**
 * 1. 동적 계획법(Dynamic Programming, DP)
 * 2. 재귀 함수를 그대로 사용할 시 시간초과가 발생
 * 3. fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = +input[0];
const out = [];

const dp = Array.from(Array(41), () => Array(2).fill(0));

dp[0][0] = 1;
dp[1][1] = 1;

for (let i = 2; i <= 40; i++) {
    dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
    dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
}

for (let i = 1; i <= N; i ++) {
    const TEST = +input[i]
    out.push(`${dp[TEST][0]} ${dp[TEST][1]}`);
}

console.log(out.join('\n'));