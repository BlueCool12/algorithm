const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(/\r?\n/);
const input = fs.readFileSync('./input.txt').toString().trim().split(/\r?\n/);

const t = input[0];
for(let i = 1; i <= t; i++) {
    const text = input[i].charAt(0) + input[i].charAt(input[i].length - 1);    
    console.log(text);
}