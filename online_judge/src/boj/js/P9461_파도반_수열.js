/**
 * 1. DP를 이용한 문제
 * 2. 규칙성을 찾아내어 점화식을 발견하는 것이 중요
 * 3. input에서 최대값을 찾아내어 그 값까지만 dp를 반복해도 효율적
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim().split('\n').map(Number);

let line = 0;

const TESTS = input[line++];


const dp = new Array(101).fill(0);
dp[1] = 1;
dp[2] = 1;
dp[3] = 1;
dp[4] = 2;
dp[5] = 2;

for (let i = 6; i < dp.length; i++) {
    dp[i] = dp[i - 1] + dp[i - 5];
}

const out = [];
for (let i = 0; i < TESTS; i++) {
    const test = input[line++];
    out.push(dp[test]);
}

console.log(out.join('\n'));