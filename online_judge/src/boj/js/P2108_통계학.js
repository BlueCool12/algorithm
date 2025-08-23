
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const N = input.shift();
const numbers = input.map(Number)
const out = [];

let result = 0;

// 산술 평균
for (let i = 0; i < numbers.length; i++) {
    result += numbers[i];
}
out.push(Math.round(result / N));

// 중앙값
numbers.sort((a, b) => a - b);
out.push(numbers[Math.floor(numbers.length / 2)]);

// 최빈값
const map = new Map();
for (const number of numbers) {
    map.set(number, (map.get(number) || 0) + 1);
}
let modes = [];
let maxCount = 0;
for (const [key, value] of map.entries()) {
    if (value > maxCount) {
        maxCount = value;
        modes = [key];
    } else if (value === maxCount) {
        modes.push(key);
    }
}
if (modes.length > 1) {
    out.push(modes.sort((a, b) => a - b)[1]);
} else {
    out.push(modes[0]);
}

// 범위
let range = (numbers[numbers.length - 1] - numbers[0]);
out.push(range < 0 ? range *= -1 : range);

console.log(out.join('\n'));