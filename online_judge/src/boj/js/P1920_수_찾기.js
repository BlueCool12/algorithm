/**
 * 1. split(' ')은 공백이 두 개 이상일 때 빈 문자열이 섞일 수 있음 따라서 /\s+/ 정규표현식 권장
 * 2. console.log()를 반복 호출하는 것보다 join('\n')로 한 번에 출력하는 것이 빠름
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
// const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

// const n = Number(input[0]);
// const target = input[1].split(' ').map(s => Number(s.trim()));
// const m = Number(input[2]);
// const array = input[3].split(' ').map(s => Number(s.trim()));

// const set = new Set();

// for (let i = 0; i < n; i++) {
//     set.add(target[i]);
// };

// for (let i = 0; i < m; i++) {
//     set.has(array[i]) ? console.log('1') : console.log('0');
// };

const tokens = fs.readFileSync('./input.txt').toString().trim().split(/\s+/).map(Number);

let p = 0;
const n = tokens[p++];
const set = new Set(tokens.slice(p, p + n));
p += n;

const m = tokens[p++];
const out = new Array(m);
for (let i = 0; i < m; i++) {
    out[i] = set.has(tokens[p++]) ? '1' : '0';
}

console.log(out.join('\n'));