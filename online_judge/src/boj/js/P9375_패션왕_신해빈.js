
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let p = 0;
const TESTS = +input[p++];

for (let test = 0; test < TESTS; test++) {
    const count = input[p++];

    const map = new Map();
    for (let i = 0; i < count; i++) {
        const [clothing, type] = input[p++].split(' ').map(i => i.trim());
        if (map.has(type)) {
            map.get(type).push(clothing);
        } else {
            map.set(type, [clothing]);
        }
    }

    const ootd = [];
    map.forEach((value, key) => {
        ootd.push(value);
    });

    let max = 1;
    for (let i = 0; i < ootd.length; i++) {
        max *= ootd[i].length + 1
    }
    max -= 1;

    console.log(max);
}