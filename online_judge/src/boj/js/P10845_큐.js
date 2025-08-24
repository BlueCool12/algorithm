/**
 * 1. 배열을 이용한 큐 구현
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = +input[0];

const queue = [];
const out = [];
for (let i = 1; i <= n; i++) {
    const query = input[i].split(' ')[0];
    const value = input[i].split(' ')[1];
    switch (query) {
        case 'push':
            queue.push(value);
            break;
        case 'pop':
            out.push(queue.length === 0 ? -1 : queue[0]);
            queue.shift();
            break;
        case 'size':
            out.push(queue.length);
            break;
        case 'empty':
            out.push(queue.length === 0 ? 1 : 0);
            break;
        case 'front':
            out.push(queue.length === 0 ? -1 : queue[0]);
            break;
        case 'back':
            out.push(queue.length === 0 ? -1 : queue[queue.length - 1]);
            break;
        default:
            break;
    }
}

console.log(out.join('\n'));