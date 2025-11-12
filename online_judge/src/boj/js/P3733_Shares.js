/**
 * 1. 디스트럭처링(destructuring)은 배열이나 객체에서 값을 꺼내 변수로 바로 할당하는 문법 (ES6)
 * 2. 배열은 [a, b]로 객체는 {a, b}형태로 할당 가능
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

for (let i = 0; i < input.length; i++) {
    const [N, S] = input[i].trim().split(' ').map(Number);
    const ACM = 1;

    const x = Math.floor(S / (N + ACM));

    console.log(x);
}