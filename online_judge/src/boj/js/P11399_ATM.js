/**
 * 1. 이중 반복문을 돌기보다 현재까지의 누적 처리 시간을 변수에 담으면 효율적
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = +input[0];
const people = input[1].split(' ').map(Number);

people.sort((a, b) => a - b);

// let time = 0;
// for (let i = 0; i < N; i++) {
//     for (let j = 0; j <= i; j++) {
//         time += people[j];
//     }
// }

// console.log(time);

let totalTime = 0;
let currentTime = 0;

for (let i = 0; i < N; i++) {
    currentTime += people[i];
    totalTime += currentTime;
}

console.log(totalTime);