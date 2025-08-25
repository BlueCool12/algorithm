/**
 * 1. DP를 이용한 문제
 * 2. n번째까지의 합을 모두 미리 연산한 뒤 점화식 계산
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const [N, M] = input[0].split(' ').map(Number);
const numbers = input[1].split(' ').map(Number);
const dp = new Array(numbers.length + 1).fill(0);
dp[1] = numbers[0];
dp[2] = numbers[0] + numbers[1];

for (let i = 2; i < numbers.length; i++) {
    dp[i + 1] = dp[i] + numbers[i];
}

const out = [];
for (let t = 0; t < M; t++) {
    const [i, j] = input[2 + t].split(' ').map(Number);

    if (i === 1) {
        out.push(dp[j]);
    } else if (i === j) {
        out.push(numbers[i - 1]);
    } else {
        out.push(dp[j] - dp[i - 1]);
    }
}

console.log(out.join('\n'));