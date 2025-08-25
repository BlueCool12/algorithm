/**
 * 1. 그래프 탐색 알고리즘 (BFS)
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const networks = Array.from({ length: +input.shift() + 1 }, () => []);
const pair = +input.shift();

for (let i = 0; i < pair; i++) {
    const [computer, network] = input[i].split(' ').map(Number);
    networks[computer].push(network);
    networks[network].push(computer);
}

const queue = [1];
const spread = new Set([1]);
let count = 0;

while (queue.length > 0) {
    const computer = queue.shift();

    for (let i = 0; i < networks[computer].length; i++) {
        const spreaded = networks[computer][i];
        if (!spread.has(spreaded)) {
            spread.add(spreaded);
            count++;
            queue.push(spreaded);
        }
    }
}

console.log(count);