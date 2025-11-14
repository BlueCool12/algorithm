/**
 * 1. 약수는 항상 짝으로 존재한다...
 * 2. 따라서 1과 N을 제외한 모든 약수들 중 가장 작은 약수 * 가장 큰 약수 === N
 * 3. 단 약수가 하나인 경우에는 약수의 제곱 === N
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = Number(input[0]);

const A = input[1].trim()
    .split(' ')
    .map(Number)
    .sort((a, b) => a - b);

if (N === 1) {
    console.log(A[0] * A[0]);
} else {
    console.log(A[0] * A[A.length - 1]);
}