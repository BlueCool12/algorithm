/**
 * 1. 최단 경로를 찾을 때에는 일반적으로 BFS가 효율적
 * 2. 시작점을 기준으로 1칸씩 떨어진 모든 노드들을 방문하며 가중치를 1씩 늘려감
 * 3. 도착지점에 도착 시 출력 후 종료
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;
const [N, M] = input[line++].split(' ').map(Number);

const maze = Array.from({ length: N }, () => new Array());

for (let i = 0; i < N; i++) {
    const route = input[line++].split('').map(Number);
    for (let j = 0; j < M; j++) {
        maze[i].push(route[j]);
    }
}

const movement = [
    [0, 1],
    [0, -1],
    [1, 0],
    [-1, 0]
];

const queue = [];
queue.push([0, 0]);

while (queue.length > 0) {
    const [cr, cc] = queue.shift();

    if (cr === N - 1 && cc === M - 1) {
        console.log(maze[cr][cc]);
        return;
    };

    for (const move of movement) {
        const [mr, mc] = move;
        const nextR = cr + mr;
        const nextC = cc + mc;

        if (nextR >= 0 && nextR < N &&
            nextC >= 0 && nextC < M &&
            maze[nextR][nextC] === 1) {

            maze[nextR][nextC] = maze[cr][cc] + 1;
            queue.push([nextR, nextC]);
        }
    }    
}