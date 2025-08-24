/**
 * 1. 양방향 매핑을 통한 풀이
 * 2. 입력 문자열이 숫자인지 아닌지를 isNaN() 함수를 사용할 수도 있음
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');
const out = [];

const [N, M] = input[0].split(' ').map(Number);

const numberMap = new Map();
const nameMap = new Map();
for (let i = 1; i <= N; i++) {
    numberMap.set(i, input[i]);
    nameMap.set(input[i], i);
}

// for (let i = 1; i <= M; i++) {
//     if (numberMap.get(+input[i + N])) {
//         out.push(numberMap.get(+input[i + N]));
//     } else {
//         out.push(nameMap.get(input[i + N]));
//     }
// }

for (let i = N + 1; i <= N + M; i++) {
    const query = input[i];
    if (isNaN(query)) {
        out.push(nameMap.get(query));
    } else {
        out.push(numberMap.get(parseInt(query)));
    }
}

console.log(out.join('\n'));