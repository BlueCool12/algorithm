/**
 * 1. 브루트포스 문제
 * 2. 이중 배열을 통해 모든 사람과 비교하여 자신보다 덩치가 큰 사람의 수를 셈
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = Number(input[0]);
const bigBoys = input.slice(1).map(line => line.split(' ').map(Number));

const rank = [];
for (let i = 0; i < n; i++) {
    let count = 1;
    for (let j = 0; j < n; j++) {
        if (bigBoys[j][0] > bigBoys[i][0] && bigBoys[j][1] > bigBoys[i][1]) {
            count++;
        }
    }
    rank.push(count);
}

console.log(rank.join(' '));