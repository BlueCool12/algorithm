/**
 * 1. 나눠보기 방식으로는 N의 크기가 커질수록 계산량이 기하급수적으로 늘어남
 * 2. 소수를 개별적으로 판별하는 대신 2부터 N까지의 모든 소수를 한 번에 찾아냄(에라토스테네스의 체)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

const M = +input[0];
const N = +input[1];

// const out = [];
// function getPrime(number) {
//     if (number === 2) {
//         return number;
//     }

//     for (let i = 2; i < number; i++) {
//         if (number % i === 0) {
//             return;
//         }
//     }
//     out.push(number);
//     return;
// }

// for (let i = M; i <= N; i++) {
//     getPrime(i);
// }

const isPrime = new Array(N + 1).fill(true);
isPrime[0] = isPrime[1] = false;

for (let i = 2; i <= Math.sqrt(N); i++) {
    if (isPrime[i]) {
        for (let j =  i * i; j <= N; j += i) {
            isPrime[j] = false;
        }
    }
}

const out = [];
for (let i = M; i <= N; i++) {
    if (isPrime[i]) {
        out.push(i);
    }
}

console.log(out.join('\n'));