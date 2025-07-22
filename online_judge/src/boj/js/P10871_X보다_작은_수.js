const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const x = input[0].split(' ')[1];
const answer = input[1].split(' ').map(Number).filter(e => e < x);

console.log(answer.join(' '));