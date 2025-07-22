/*
    1. slice() 를 이용하여 이중 배열을 만듦
    2. 반복문을 돌면서 두 수의 합을 ' '으로 join()
    3. '\n'으로 조인하여 출력
*/

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const [n, m] = input[0].split(' ').map(Number);
const a = input.slice(1, n + 1).map(line => line.split(' ').map(Number));
const b = input.slice(n + 1).map(line => line.split(' ').map(Number));

const answer = [];

for (let i = 0; i < n; i++) {
    const row = [];
    for (let j = 0; j < m; j++) {
        row.push(a[i][j] + b[i][j]);
    }
    answer.push(row.join(' '));
}

console.log(answer.join('\n'));