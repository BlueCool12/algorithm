/**
 * 1. 덱 자료구조를 배열로 흉내냈지만 O(n) 시간복잡도로 성능상 불리
 * 2. 맨 앞을 버리고 다음 것을 맨 뒤로 붙이는 동작을 인덱스 큐로 구현
 * 3. 수학 공식: 남은 카드는 n이 2의 거듭제곱이면 n, 아니면 2 * (n - 2^[log2 n])
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const n = +input;

// const cards = [];
// for (let i = 1; i <= n; i++) {
//     cards.push(i);
// }

// while (cards.length > 1) {
//     cards.shift();
//     cards.push(cards[0]);
//     cards.shift();
// }

// console.log(cards[0]);

const q = new Array(2 * n);
for (let i = 0; i < n; i++) q[i] = i + 1;

let head = 0, tail = n;
while (tail - head > 1) {
    head++;
    q[tail++] = q[head++];
}

console.log(q[head]);

// const p = 1 << Math.floor(Math.log2(n));
// const answer = (n === p) ? n : 2 * (n - p);
// console.log(answer);