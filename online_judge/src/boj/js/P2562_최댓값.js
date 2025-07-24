/*
    1. Math.max()는 전달된 값들 중 가장 큰 값을 반환하는 함수 (스프레드 연산자로 전달)
    2. indexOf()는 배열에서 파라미터로 전달된 값이 처음 나타나는 인덱스를 반환하는 함수
*/

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim().split('\n').map(Number);

// let maxNumber = 0;
// let maxIndex = 0;
// for (let i = 0; i < input.length; i++) {
//     if (maxNumber < Number(input[i])) {
//         maxNumber = Number(input[i]);
//         maxIndex = i + 1;
//     }
// }

// console.log(maxNumber);
// console.log(maxIndex);

const maxNumber = Math.max(...input);
const maxIndex = input.indexOf(maxNumber) + 1;

console.log(maxNumber);
console.log(maxIndex);