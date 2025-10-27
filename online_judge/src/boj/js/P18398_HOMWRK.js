const fs = require('fs');
// const nums = fs.readFileSync(0, 'utf8').trim().split(/\s+/).map(Number);
const nums = fs.readFileSync('./input.txt', 'utf8').trim().split(/\s+/).map(Number);

let p = 0;
const T = nums[p++];
let out = [];

for (let t = 0; t < T; t++) {
    const N = nums[p++];
    for (let i = 0; i < N; i++) {
        const a = nums[p++], b = nums[p++];
        out.push(`${a + b} ${a * b}`);
    }
}

console.log(out.join('\n'));