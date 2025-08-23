/**
 * 1. Array.from()은 length속성과 인덱스 요소를 가진 객체를 배열로 변환
 * 2. (현재 인덱스 + 이동할 칸 수)를 현재 배열의 길이로 나눈 나머지를 구하여 순환
 * 3. splice(index, 1)는 index위치에서 1개의 요소를 제거하고 배열로 반환
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

const N = +input[0];
let K = +input[1];

const people = Array.from({ length: N }, (_, i) => i + 1);
const result = [];
let index = 0;

while (people.length > 0) {
    index = (index + K - 1) % people.length;
    result.push(people.splice(index, 1)[0]);
}

console.log(`<${result.join(', ')}>`);