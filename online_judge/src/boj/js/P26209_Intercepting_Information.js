/**
 * 1. forEach() 를 사용하면 break 가 불가...
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim().split(' ').map(Number);

let success = true;
for (const value of input) {
    if (value === 9) {
        success = false;
        break;
    }
}

console.log(success ? 'S' : 'F');