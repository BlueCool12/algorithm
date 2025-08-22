const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = Number(input[0]);
const xy = input.slice(1).map(s => s.trim().split(' ').map(Number));

xy.sort((a, b) => a[0] - b[0] || a[1] - b[1]);

for (let i = 0; i < n; i++) {
    console.log(`${xy[i][0]} ${xy[i][1]}`);
};