const fs = require('fs');
const input = fs.readFileSync(
  process.platform === 'linux' ? 0 : __dirname + '/input.txt'
).toString().trim().split('\n');

const arr = input[1].split(' ').map(Number);

// let temp = 0;
// let max = 0;
// for (let n = 0; n < arr.length - 1; n++) {
//     if (arr[n] < arr[n + 1]) {
//         temp += arr[n + 1] - arr[n];
//     } else {
//         max = Math.max(max, temp);
//         temp = 0;
//     }

//     if (n == arr.length - 2) {
//         max = Math.max(max, temp);        
//     }
// }

// console.log(max);

let temp = 0;
let max = 0;

for (let n = 0; n < arr.length - 1; n++) {
    if (arr[n] < arr[n + 1]) {
        temp += arr[n + 1] - arr[n];
    } else {
        max = Math.max(max, temp);
        temp = 0;
    }
}

max = Math.max(max, temp);
console.log(max);