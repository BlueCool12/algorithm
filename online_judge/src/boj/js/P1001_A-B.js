const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';

const input = fs.readFileSync(filePath).toString().split(' ');

const A = parseInt(input[0]);
const B = parseInt(input[1]);

console.log(A - B);