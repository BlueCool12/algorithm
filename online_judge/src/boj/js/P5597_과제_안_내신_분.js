/*
    1. find() 를 이요해서 없는 출석번호를 찾았지만 성능을 고려한다면
    Set이 더 좋을 듯
    2. filter() 를 사용하거나 Boolean 배열도 고려해볼만 함
*/

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const students = input.map(Number);

const studentSet = new Set(students);
const notStudents = [];
for (let i = 1; i <= 30; i++) {
    // if (!students.find(e => e === i)) {
    //     notStudents.push(i);
    // }
    if (!studentSet.has(i)) {
        notStudents.push(i);
    }
}

const sortedNotStudents = notStudents.sort((a, b) => a - b);

console.log(sortedNotStudents.join('\n'));