/**
 * 1. 단순한 선형 탐색으로는 시간 초과가 발생
 * 2. 해시맵을 사용하여 해결
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = +input[0];
const numbers = input[1].split(' ').map(Number);
const m = +input[2];
const cards = input[3].split(' ').map(Number);

// for (let i = 0; i < m; i++) {
//     let count = 0;
//     for (let j = 0; j < n; j++) {
//         if (cards[i] === numbers[j]) count++;
//     }
//     console.log(count);
// }

const cardCounts = new Map();
for (const number of numbers) {
    cardCounts.set(number, (cardCounts.get(number) || 0) + 1);
}

const result = [];
for (const card of cards) {
    result.push(cardCounts.get(card) || 0);
}

console.log(result.join(' '));