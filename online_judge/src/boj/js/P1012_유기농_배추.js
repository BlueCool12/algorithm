/**
 * 1. BFS를 이용한 문제
 * 2. queue.shift()를 사용하는 것보다 head 포인터를 사용하면 성능 개선 가능
 * 3. 방문 여부를 따로 배열에 표시할 수도 있지만 farm 배열의 값을 0으로 덮어쓰면 배열 하나로 풀이 가능
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;
const TESTS = +input[line++];

for (let i = 0; i < TESTS; i++) {
    const [M, N, K] = input[line++].split(' ').map(Number);

    const farm = Array.from({ length: N }, () => new Array(M).fill(0));

    for (let i = 0; i < K; i++) {
        const [X, Y] = input[line++].split(' ').map(Number);
        farm[Y][X] = 1;
    }

    const visited = Array.from({ length: N }, () => new Array(M).fill(false));

    const movement = [
        [0, 1],
        [0, -1],
        [1, 0],
        [-1, 0]
    ];

    let count = 0;
    for (let i = 0; i < N; i++) {
        for (let j = 0; j < M; j++) {

            if (farm[i][j] === 1 && !visited[i][j]) {
                const queue = [];
                queue.push([i, j]);
                visited[i][j] = true;

                while (queue.length > 0) {
                    const [x, y] = queue.shift();                    

                    for (const move of movement) {
                        const [mx, my] = move;                        

                        if (x + mx >= 0 && x + mx < N &&
                            y + my >= 0 && y + my < M &&
                            farm[x + mx][y + my] === 1 && !visited[x + mx][y + my]) {
                            visited[x + mx][y + my] = true;
                            queue.push([x + mx, y + my]);
                        }
                    }
                }    
                
                count++;
            }

        }
    }

    console.log(count);
}