/*
    charCodeAt()은 아스키 코드를 반환
    toUpperCase()는 대문자로 변환
    toLowerCase()는 소문자로 변환
    문자열을 누적하는 것보다 배열 -> join 방식이 더 성능이 좋음
*/

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

// let answer = '';
// for (let i = 0; i < input.length; i++) {
//     if (input.charCodeAt(i) > 96) {
//         answer += input[i].toUpperCase();        
//     } else {
//         answer += input[i].toLowerCase();
//     }
// }

let answerArr = [];
for (let ch of input) {
    answerArr.push(ch === ch.toLowerCase() ? ch.toUpperCase() : ch.toLowerCase());
}

console.log(answerArr.join(''));