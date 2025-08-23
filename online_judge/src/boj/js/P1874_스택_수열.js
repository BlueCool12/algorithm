/**
 * 1. 스택의 LIFO 구조와 1부터 n까지 오름차순으로만 push하는 규칙을 이해
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = +input.shift();

const sequence = input.map(Number);
console.log(sequence);

function solve() {
    const stack = [];
    const result = [];
    let currentNumber = 1;
    let possible = true;

    for (let i = 0; i < n; i++) {
        const target = sequence[i];

        while(currentNumber <= target) {
            stack.push(currentNumber);
            result.push('+');
            currentNumber++;
        }

        if (stack[stack.length - 1] === target) {
            stack.pop();
            result.push('-');
        } else {
            possible = false;
            break;
        }
    }

    if (possible) {
        console.log(result.join('\n'));
    } else {
        console.log('NO');
    }
}

solve();