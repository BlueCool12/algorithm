/**
 * 1. 반복문의 조건식을 잘못 사용하여 불필요한 분기가 많음
 * 2. 값에서 5로 나누어 떨어질 때까지 순차적으로 3을 빼는 방식도 가능
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const n = +input;


// let max = Math.trunc(n / 5);
// if (max === 0) {
//     n % 3 === 0 ? console.log(n / 3) : console.log(-1);
// } else {
//     for (let i = 0; i <= max;) {
//         if ((n - (5 * max)) % 3 === 0) {
//             console.log(max + (n - (5 * max)) / 3);
//             break;
//         }
//         max--;

//         if (max === 0) {
//             n % 3 === 0 ? console.log(n / 3) : console.log(-1);
//             break;
//         }
//     };
// }

let m = n, cnt = 0;
while (m >= 0) {
    if (m % 5 === 0) {
        console.log(cnt + m / 5);
        return;
    }
    m -= 3;
    cnt++;
}
console.log(-1);

for (let five = Math.trunc(n / 5); five >= 0; five--) {
    const rest = n - 5 * five;
    if (rest % 3 === 0) {
        console.log(five + rest / 3);
        return;
    }
}
console.log(-1);