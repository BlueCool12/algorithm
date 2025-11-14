/**
 * 1. 중복 카운트가 필요 없기 때문에 Set 이 더 깔끔
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

// for (let i = 0; i < input.length; i++) {
//     const line = input[i].trim().replace(/\s+/g, '').toLowerCase();

//     if (line === '#') {
//         return;
//     }

//     const alphabet = Array.from({ length: 26 }, () => 0);
//     line.split('').forEach((value) => {{
//         if (value.charCodeAt() - 97 >= 0 && value.charCodeAt() - 97 <= 25)
//         alphabet[value.charCodeAt() - 97]++;
//     }});

//     console.log(alphabet.filter((value) => value > 0).length);
// }

for (const raw of input) {
    const line = raw.trim();

    if (line === '#') break;

    const match = line.toLowerCase().match(/[a-z]/g);
    const letters = new Set(match || []);

    console.log(letters.size);
}