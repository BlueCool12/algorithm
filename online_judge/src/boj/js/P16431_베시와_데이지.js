
const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const bessie = input[0].split(' ').map(Number)
const daisy = input[1].split(' ').map(Number)
const john = input[2].split(' ').map(Number);

const recordOfBessie = Math.ceil((Math.abs(john[0] - bessie[0]) + Math.abs(john[1] - bessie[1])) / 2);
const recordOfDaisy = Math.abs(john[0] - daisy[0]) + Math.abs(john[1] - daisy[1]);

console.log(recordOfBessie === recordOfDaisy ? 'tie' : recordOfBessie < recordOfDaisy ? 'bessie' : 'daisy');