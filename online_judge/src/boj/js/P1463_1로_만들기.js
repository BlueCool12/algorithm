/**
 * 1. DP로 풀이
 * 2. 역으로 1부터 N까지의 숫자를 1로 만드는 최소값을 구함
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const N = +input;

const dp = new Array(N + 1).fill(0);
for (let i = 2; i <= N; i++) {
    dp[i] = dp[i - 1] + 1;

    if (i % 2 === 0) {
        dp[i] = Math.min(dp[i], dp[i / 2] + 1);
    }

    if (i % 3 === 0) {
        dp[i] = Math.min(dp[i], dp[i / 3] + 1);
    }
}

console.log(dp[N]);