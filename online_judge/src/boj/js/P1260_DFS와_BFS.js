/**
 * 1. 깊이 우선 탐색(DFS, Depth-First Search)는 스택 자료구조나 재귀 함수를 이용해 구현
 * 2. 너비 우선 탐색(BFS, Breadth-First Search)는 큐 자료구조를 이용해 구현
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const [N, M, V] = input[0].split(' ').map(Number);
const graph = Array.from({ length: N + 1 }, () => []);

for (let i = 1; i <= M; i++) {
    const [from, to] = input[i].split(' ').map(Number);
    graph[from].push(to);
    graph[to].push(from);
}

for (let i = 1; i <= N; i++) {
    graph[i].sort((a, b) => a - b);
}

const dfsResult = [];
const dfsVisited = new Array(N + 1).fill(false);

function dfs(v) {
    dfsVisited[v] = true;
    dfsResult.push(v);

    for (const nextNode of graph[v]) {
        if (!dfsVisited[nextNode]) {
            dfs(nextNode);
        }
    }
}

dfs(V);
console.log(dfsResult.join(' '));


const bfsResult = [];
const bfsVisited = new Array(N + 1).fill(false);
const queue = [V];
bfsVisited[V] = true;

while (queue.length > 0) {
    const currentNode = queue.shift();
    bfsResult.push(currentNode);

    for (const nextNode of graph[currentNode]) {
        if (!bfsVisited[nextNode]) {
            bfsVisited[nextNode] = true;
            queue.push(nextNode);
        }
    }
}

console.log(bfsResult.join(' '));