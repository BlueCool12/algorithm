/**
 * 1. 배열과 아스키 코드를 사용하여 풀이
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const word = input[0];

const alphabet = new Array(26).fill(0);

for (let i = 0; i < word.length; i++) {
    alphabet[word.charCodeAt(i) - 97]++;
}

console.log(alphabet.join(' '));