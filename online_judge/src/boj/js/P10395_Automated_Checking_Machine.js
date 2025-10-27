const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const X = input[0].split(' ').map(Number);
const Y = input[1].split(' ').map(Number);

for (let i = 0; i < X.length; i++) {
    if (X[i] === Y[i]) {
        console.log('N');
        return;
    }
}

console.log('Y');