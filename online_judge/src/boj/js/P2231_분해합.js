/*
    1. 브루트포스 탐색: 1부터 N - 1까지 전부 검사 
    2. 재귀함수를 이용해 각 자릿수의 핪을 구함
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim();

const n = Number(input);

function sumDigits(n) {
    if (n < 10) return n;    
    return (n % 10) + sumDigits(Math.trunc(n / 10));
}

for (let i = 1; i <= n; i++) {
    const m = i + sumDigits(i);    

    if (m === n) {
        console.log(i);
        return;
    }
}

console.log(0);