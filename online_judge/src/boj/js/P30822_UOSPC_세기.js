/**
 * 1. Set.has로 검사 대상 문자에 포함되는지 확인 가능
 * 2. 스프레드 연산자 사용 가능
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

// const UOSPC = {
//     'u': 0,
//     'o': 0,
//     's': 0,
//     'p': 0,
//     'c': 0
// };

// const word = input[1];

// for (let i = 0; i < +input[0]; i++) {
//     const char = word[i];
//     if (char === 'u' || char === 'o' || char === 's' || char === 'p' || char === 'c') {
//         UOSPC[char]++;
//     }
// }

// console.log(Math.min(UOSPC.u, UOSPC.o, UOSPC.s, UOSPC.p, UOSPC.c));

const target = new Set(['u', 'o', 's', 'p', 'c']);
const cnt = { u: 0, o: 0, s: 0, p: 0, c: 0 };

for (let i = 0; i < +input[0]; i++) {
    const char = input[1][i];
    if (target.has(char)) cnt[char]++;
}

console.log(Math.min(...Object.values(cnt)));