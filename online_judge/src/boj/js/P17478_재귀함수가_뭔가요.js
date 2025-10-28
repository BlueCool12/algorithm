/**
 * 1. 재귀함수를 이용한 문제
 * 2. 재귀함수 호출 위치를 조절하여 반복문을 사용하지 않음
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim();
const input = fs.readFileSync('./input.txt').toString().trim();

const N = +input;

// console.log(`어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.`);

// function chat(n, start) {
//     if (n === 0) {                
//         const out = [];

//         out.push(`${'____'.repeat(start)}"재귀함수가 뭔가요?"\n${'____'.repeat(start)}"재귀함수는 자기 자신을 호출하는 함수라네"`);
//         for (let i = start; i >= 0; i--) {
//             out.push(`${'____'.repeat(i)}라고 답변하였지.`);
//         }

//         return out.join('\n');
//     }            

//     console.log(`${'____'.repeat(start)}"재귀함수가 뭔가요?"`);
//     console.log(`${'____'.repeat(start)}"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.`);
//     console.log(`${'____'.repeat(start)}마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.`);
//     console.log(`${'____'.repeat(start)}그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."`);

//     return chat(n - 1, start + 1);
// }

// console.log(chat(N, 0));

function chat(n, depth) {
    const pre = '____'.repeat(depth);
    let s = `${pre}"재귀함수가 뭔가요?"\n`;
    if (n === 0) {
        s += `${pre}"재귀함수는 자기 자신을 호출하는 함수라네"\n`;
        s += `${pre}라고 답변하였지.\n`;
        return s;
    }
    s += `${pre}"잘 들어보게. 옛날옛날 한 산 꼭대기에 이 세상 모든 지식을 통달한 선인이 있었어.\n`;
    s += `${pre}마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n`;
    s += `${pre}그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어."\n`;
    s += chat(n - 1, depth + 1);
    s += `${pre}라고 답변하였지.\n`;
    return s;
}

let result = '어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n';
result += chat(N, 0);
console.log(result.trimEnd());