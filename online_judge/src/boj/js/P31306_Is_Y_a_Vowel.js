/**
 * 1. 객체에 누적할 경우 모음에 포함되지 않는 경우에도 누적되어 NaN 발생
 * 2. 따라서 Set을 활용해서 카운트 하거나 정규표현식을 사용하는게 좋음
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

// const VOWEL = {
//     'a': 0,
//     'e': 0,
//     'i': 0,
//     'o': 0,
//     'u': 0,
//     'y': 0
// };

// for (let i = 0; i < input.length; i++) {
//     VOWEL[input[i]]++;
// }

// const vowelCount = VOWEL['a'] + VOWEL['e'] + VOWEL['i'] + VOWEL['o'] + VOWEL['u'];
// const includeY = vowelCount + VOWEL['y'];

// console.log(`${vowelCount} ${includeY}`);

const vowelOnly = (input.match(/[aeiou]/gi) || []).length;
const vowelPlusY = (input.match(/[aeiouy]/gi) || []).length;

console.log(`${vowelOnly} ${vowelPlusY}`);