/**
 * 1. repeat을 이용하면 한줄로 표현 가능
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const N = Number(input);

const total = 2 * N;
const line = (i) => {
    return '*'.repeat(i) + ' '.repeat(total - 2 * i) + '*'.repeat(i);
};

const out = [];
for (let i = 1; i <= N; i++) out.push(line(i));
for (let i = N - 1; i >= 1; i--) out.push(line(i));

console.log(out.join('\n'));

// for (let i = 1; i <= N; i++) {
//     const out = [];
//     for (let j = 1; j <= N * 2; j++) {
//         if (j <= i || j > N * 2 - i) {
//             out.push('*');
//         } else {
//             out.push(' ');
//         }
//     }
//     console.log(out.join(''));
// }

// for (let i = N - 1; i > 0; i--) {
//     const out = [];
//     for (let j = 1; j <= N * 2; j++) {
//         if (j <= i || j > N * 2 - i) {
//             out.push('*');
//         } else {
//             out.push(' ');
//         }
//     }
//     console.log(out.join(''));
// }