/**
 * 1. +는 단항 플러스(unary plus) 연산자 Number(x)와 거의 동일
 * 2. 배열을 만들때 index값을 추가한 것은 동일한 나이일 경우 입력 순서를 보장하기 위함
 * 3. 최신 js 엔진에서는 안정성이 보장됨
 * 4. sort()의 비교 함수는 음수/0/양수를 반환해야 하고 그 값으로 정렬 방향을 결정함
 *    a[0] - b[0]의 값이 음수이면 a가 앞 양수면 b가 앞 0인 경우 뒤의 비교로 넘어감
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = +input[0];
const students = new Array(n);

// for (let i = 0; i < students.length - 1; i++) {
//     for (let j = 0; j < students.length - 1; j++) {
//         if (Number(students[j][0]) > Number(students[j + 1][0])) {
//             [students[j], students[j + 1]] = [students[j + 1], students[j]];

//             // const tmp = students[j];
//             // students[j] = students[j + 1];
//             // students[j + 1] = tmp;
//         }
//     }
// };

for (let i = 0; i < n; i++) {
    const line = input[i + 1].trim();
    const sp = line.indexOf(' ');
    const age = +line.slice(0, sp);
    const name = line.slice(sp + 1);
    students[i] = [age, name, i];
}

students.sort((a, b) => a[0] - b[0] || a[2] - b[2]);

// 위의 sort() 함수의 풀이
// students.sort((a, b) => {
//     const byAge = a[0] - b[0];
//     if (byAge !== 0) return byAge;     // 나이로 결정
//     return a[2] - b[2];                // 나이 같으면 입력 순서로
// });

for (let i = 0; i < n; i++) {
    console.log(students[i][0] + ' ' + students[i][1]);
};