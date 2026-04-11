/**
 * 1. 2의 제곱수는 이진수로 보면 1이 하나만 존재함
 * 2. 따라서 N & (N - 1)로 비트 연산 시 1이 사라짐 (0은 제외)
 */

const fs = require('fs');
const input = fs.readFileSync(
  process.platform === 'linux' ? 0 : __dirname + '/input.txt'
).toString().trim().split('\n');

let N = Number(input[0]);

// if (N === 1) {
//     console.log(1);
//     return;
// } else {
//     while (N > 1) {
//         if (N % 2 !== 0) {
//             console.log(0);
//             return;
//         } else {
//             N /= 2;
//         }
//     }

//     console.log(1);
// }

console.log((N & (N - 1)) === 0 ? 1 : 0);