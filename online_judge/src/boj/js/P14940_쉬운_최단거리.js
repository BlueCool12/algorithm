/**
 * 1. BFS를 이용한 문제
 * 2. 방문 여부를 함께 체크하여 갈 수 없는 길은 -1로 출력
 * 3. 마지막 출력 시 map()을 이용하여 각 행을 먼저 join()
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;

const [N, M] = input[line++].split(' ').map(Number);
const map = Array.from({ length: N }, () => new Array());
const visited = Array.from({ length: N }, () => new Array().fill(false));

const start = [];
for (let i = 0; i < N; i++) {
    const row = input[line++].split(' ').map(Number);
    for (let j = 0; j < M; j++) {
        map[i].push(row[j]);

        if (row[j] === 2) {
            start.push(i);
            start.push(j);
        }
    }
}

const movement = [
    [0, 1],
    [0, -1],
    [1, 0],
    [-1, 0]
];

const queue = [];
queue.push(start);
visited[start[0]][start[1]] = true;
map[start[0]][start[1]] = 0;

while (queue.length > 0) {
    const [cr, cc] = queue.shift();

    for (const move of movement) {
        const [mr, mc] = move;
        const nextR = cr + mr;
        const nextC = cc + mc;

        if (nextR >= 0 && nextR < N &&
            nextC >= 0 && nextC < M &&
            !visited[nextR][nextC] &&
            map[nextR][nextC] > 0) {
            queue.push([nextR, nextC]);
            visited[nextR][nextC] = true;

            map[nextR][nextC] = map[cr][cc] + 1;
        }
    }
}

for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
        if (!visited[i][j] && map[i][j] === 1) {
            map[i][j] = -1;
        }
    }
}

const answer = map.map(row => row.join(' ')).join('\n');
console.log(answer);