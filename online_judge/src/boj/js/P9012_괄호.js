/**
 * 1. 스택을 이용한 문제 (선입후출: FILO)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = input[0];

function isVPS(str) {
    const stack = [];
    for (const ch of str) {
        if (ch === '(') stack.push(ch);
        else if (ch === ')') {
            if (stack.pop() !== '(') return false;
        }
    }
    return stack.length === 0;
}

let out = [];
for (let i = 1; i <= n; i++) {
    out.push(isVPS(input[i]) ? 'YES' : 'NO');
}
console.log(out.join('\n'));