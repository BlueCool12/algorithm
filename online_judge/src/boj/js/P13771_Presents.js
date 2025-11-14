/**
 * 1. toFixed()는 숫자를 소수점 아래 N자리 까지 문자열로 바꿔주는 메서드
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = Number(input[0].trim());

const presents = [];
for (let i = 1; i <= N; i++) {
    presents.push(Number(input[i]));
}

presents.sort((a, b) => a - b);

// console.log(presents[1].toString().padStart(5, 0));
console.log(presents[1].toFixed(2));