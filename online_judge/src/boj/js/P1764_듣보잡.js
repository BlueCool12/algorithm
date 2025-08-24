/**
 * 1. 전체 명단을 Map에 넣고 값을 카운트한 후 정렬
 * 2. Set의 has()를 사용하면 더 효율적
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');
const out = [];

const [N, M] = input[0].split(' ').map(Number);

// const neverSeen = [];
// for (let i = 1; i <= N; i++) {
//     neverSeen.push(input[i]);
// }

// for (let i = N + 1; i <= N + M; i++) {
//     if (neverSeen.includes(input[i])) {
//         out.push(input[i]);
//     }
// }

// out.sort();
// console.log(out.length + '\n' + out.join('\n'));

// const map = new Map();
// for (let i = 1; i <= N + M; i++) {    
//     map.set(input[i], (map.get(input[i]) || 0) + 1);
// }

// map.forEach((value, key) => {
//     if (value > 1) {        
//         out.push(key);
//     }
// });

// out.sort();
// console.log(out.length + '\n' + out.join('\n'));

const neverSeen = new Set();
for (let i = 1; i <= N; i++) {
    neverSeen.add(input[i]);
}

for (let i = N + 1; i <= N + M; i++) {
    if (neverSeen.has(input[i])) {
        out.push(input[i]);
    }
}

out.sort();
console.log(out.length + '\n' + out.join('\n'));