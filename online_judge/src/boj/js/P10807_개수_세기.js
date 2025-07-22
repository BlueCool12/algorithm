/*
    1. input이 문자열이기 때문에 형변환 필수
    2. filter 메서드는 조건이 참인 요소만 골라서 새로운 배열로 반환
    3. 배열은 length 라는 속성을 가짐 
*/

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const v = Number(input[2]);

const answer = input[1].split(' ').map(Number).filter(e => e === v);

console.log(answer.length);