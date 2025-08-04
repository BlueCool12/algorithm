/*
 *  1. 이항 계수
 *  2. StackSizeExceeded 에러로 반복문으로 변경 
 *  3. 조합 방식으로 하면 계산량이 줄어서 효율적
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ').map(Number);

const n = input[0];
const k = input[1];

// function factorial(number) {
//     // if (number === 0) return 1;
//     // return number * factorial(number - 1);

//     let result = 1;
//     for (let i = 2; i <= number; i++) {
//         result *= i;
//     }
//     return result;
// }

function combination(n, k) {
    if (k === 0 || k === n) return 1;
    let num = 1;
    let denom = 1;
    for (let i = 0; i < k; i++) {
        num *= n - i;
        denom *= i + 1;
    }
    return num / denom;
}

console.log(combination(n, k));