const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split(' ');
const input = fs.readFileSync('./input.txt').toString().trim().split(' ');

function valid(ids) {
    let validationNumber = 0;
    for (const id of ids) {
        validationNumber += Number(id) * Number(id);
    }
    return validationNumber % 10;
}

console.log(valid(input));