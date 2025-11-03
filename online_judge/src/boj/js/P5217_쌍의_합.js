
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n').map(Number);
const input = fs.readFileSync('./input.txt').toString().trim().split('\n').map(Number);

for (let i = 1; i <= input[0]; i++) {
    const out = [];
    for (let j = 1; j <= input[i] / 2; j++) {
        if (input[i] - j !== j) {
            out.push(`${j} ${input[i] - j}`);
        }
    }
    console.log(`Pairs for ${input[i]}: ${out.join(', ')}`);
}