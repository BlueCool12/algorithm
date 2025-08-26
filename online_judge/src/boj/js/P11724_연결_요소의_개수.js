
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let line = 0;
const [N, M] = input[line++].split(' ').map(Number);

const nodes = Array.from({ length: N + 1 }, () => new Array());
const visited = new Array(N + 1).fill(false);

for (let i = 0; i < M; i++) {
    const [x, y] = input[line++].split(' ').map(Number);
    nodes[x].push(y);
    nodes[y].push(x);
}

function dfs(nodeIndex) {
    if (!visited[nodeIndex]) {
        visited[nodeIndex] = true;
        for (const node of nodes[nodeIndex]) {
            dfs(node);
        }
    }
}

let count = 0;
for (let node = 1; node < nodes.length; node++) {
    if (!visited[node]) {
        dfs(node);
        count++;
    }
}

console.log(count);