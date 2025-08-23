/**
 * 1. shift()는 배열의 가장 앞에 있는 요소를 제거하면서 그 요소를 반환
 * 2. some()은 배열의 요소가 주어진 조건을 하나라도 만족하는지를 검사
 *    조건에 맞는 요소를 발견하는 즉시 true를 반환
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const TESTS = +input[0];
let line = 1;

for (let test = 0; test < TESTS; test++) {
    const [N, M] = input[line].split(' ').map(Number);
    const importance = input[line + 1].split(' ').map(Number);    

    const queue = importance.map((value, index) => ({ value, index }));    

    let printCount = 0;

    while (queue.length > 0) {
        const current = queue.shift();

        const hasHigherImportance = queue.some(doc => doc.value > current.value);        

        if (hasHigherImportance) {
            queue.push(current);
        } else {
            printCount++;

            if (current.index === M) {
                console.log(printCount);
                break;
            }
        }        
    }

    line += 2;
}