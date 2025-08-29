/**
 * 1. BFS를 이용한 문제
 * 2. BFS를 두번 반복해야 하기 때문에 함수로 만드는게 더 좋음
 * 3. BFS의 조건식을 잘 확인하기...
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;
const N = +input[line++];

const image = Array.from({ length: N }, () => new Array(N));
let visited = Array.from({ length: N }, () => new Array(N).fill(false));

for (let i = 0; i < N; i++) {
    const row = input[line++].split('');
    for (let j = 0; j < N; j++) {
        image[i][j] = row[j];
    }
}

const movement = [
    [0, 1],
    [0, -1],
    [1, 0],
    [-1, 0]
];

const out = [];

const queue = [];
let count = 0;

for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        if (!visited[i][j]) {
            queue.push([i, j]);
            visited[i][j] = true;

            while (queue.length > 0) {
                const [cr, cc] = queue.shift();
                const rgb = image[cr][cc];

                for (const move of movement) {
                    const [mr, mc] = move;
                    const nextR = cr + mr;
                    const nextC = cc + mc;

                    if (nextR >= 0 && nextC >= 0 &&
                        nextR < N && nextC < N &&
                        !visited[nextR][nextC]) {
                        if (image[nextR][nextC] === rgb) {
                            queue.push([nextR, nextC]);
                            visited[nextR][nextC] = true;
                        }
                    }
                }
            }

            count++;
        }
    }
}

out.push(count);
visited = Array.from({ length: N }, () => new Array(N).fill(false));

count = 0;
for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
        if (!visited[i][j]) {
            queue.push([i, j]);
            visited[i][j] = true;

            while (queue.length > 0) {
                const [cr, cc] = queue.shift();

                for (const move of movement) {
                    const [mr, mc] = move;
                    const nextR = cr + mr;
                    const nextC = cc + mc;

                    if (nextR >= 0 && nextC >= 0 &&
                        nextR < N && nextC < N &&
                        !visited[nextR][nextC]) {
                        if (image[cr][cc] === 'B' && image[nextR][nextC] === 'B') {
                            queue.push([nextR, nextC]);
                            visited[nextR][nextC] = true;
                        } else if ((image[cr][cc] === 'R' || image[cr][cc] === 'G') &&
                            (image[nextR][nextC] === 'R' || image[nextR][nextC] === 'G')) {
                            queue.push([nextR, nextC]);
                            visited[nextR][nextC] = true;
                        }
                    }
                }
            }

            count++;
        }
    }
}

out.push(count);
console.log(out.join(' '));