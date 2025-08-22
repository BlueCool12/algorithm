/**
 * 1. 스택을 이용한 문제 (선입후출: FILO)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().split('\n');

const pair = { ')': '(', ']': '[' };

function isBalanced(str) {
    const stack = [];
    for (const ch of str) {
        if (ch === '.') break;
        if (ch === '(' || ch === '[') stack.push(ch);
        else if (ch === ')' || ch === ']') {
            if (stack.pop() !== pair[ch]) return false;
        }
    }
    return stack.length === 0;
}

let out = [];
for (const raw of input) {
    const line = raw.replace(/\r$/, '');
    if (line === '.') break;
    out.push(isBalanced(line) ? 'yes' : 'no');
}
console.log(out.join('\n'));