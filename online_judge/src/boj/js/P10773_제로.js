/**
 * 1. 합계를 동시에 갱신해서 반복문을 줄일 수 있음 (성능 최적화)
 * 2. reduce를 통해 합산 가능 (가독성 최적화)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

// const n = input[0];

// const money = [];
// for (let i = 1; i <= n; i++) {    
//     if (Number(input[i]) === 0) {        
//         money.pop();
//     } else {
//         money.push(Number(input[i]));
//     }
// }

// if (money.length === 0) {
//     console.log(0);
// } else {
//     let sum = 0;
//     for (let i = 0; i < money.length; i++) {
//         sum += money[i];
//     }
//     console.log(sum);
// }

const n = +input[0];
const stack = [];
// let sum = 0;

// for (let i = 1; i <= n; i++) {
//     const x = +input[i];
//     if (x === 0) {
//         sum -= stack.pop();
//     } else {
//         stack.push(x);
//         sum += x;
//     }
// }
// console.log(sum);

for (let i = 1; i <= n; i++) {
    const x = +input[i];
    x === 0 ? stack.pop() : stack.push(x);
}
console.log(stack.reduce((a, b) => a + b, 0));