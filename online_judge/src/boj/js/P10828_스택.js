/**
 * 1. 배열을 이용한 스택 구현
 * 2. 맵을 사용해서도 구현해보았다
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const n = +input[0];

const stack = [];
for (let i = 1; i <= n; i++) {
    const query = input[i].startsWith('push') ? 'push' : input[i];
    switch (query) {
        case 'push':
            stack.push(Number(input[i].split(' ')[1]));
            break;
        case 'pop':
            console.log(stack.length === 0 ? -1 : stack.pop());
            break;
        case 'size':
            console.log(stack.length);
            break;
        case 'empty':
            console.log(stack.length === 0 ? 1 : 0);
            break;
        case 'top':
            console.log(stack.length === 0 ? -1 : stack[stack.length - 1]);
            break;
        default:
            break;
    }
}

// let size = 0;
// const map = new Map();

// let out = [];
// for (let i = 1; i <= n; i++) {
//     const query = input[i].startsWith('push') ? 'push' : input[i];
//     switch (query) {
//         case 'push':
//             map.set(size++, Number(input[i].split(' ')[1]));
//             break;
//         case 'pop':
//             out.push(map.get(size - 1) ? map.get(size - 1) : -1);
//             map.delete(size - 1);
//             size = size === 0 ? 0 : size - 1;
//             break;
//         case 'size':
//             out.push(size);
//             break;
//         case 'empty':
//             out.push(size === 0 ? 1 : 0);
//             break;
//         case 'top':
//             out.push(map.get(size - 1) ? map.get(size - 1) : -1);
//             break;
//         default:
//             break;
//     }
// }

// console.log(out.join('\n'));