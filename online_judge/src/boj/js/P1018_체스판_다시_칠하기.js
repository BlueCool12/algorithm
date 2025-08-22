/**
 * 1. 완전 탐색: 모든 8x8 서브보드를 검사
 * 2. 각 서브보드에서 'W'로 시작하는 패턴과의 불일치 개수를 확인
 * 3. 'B'로 시작하는 패턴은 보수 관계이므로 repaintB = 64 - repaintW
 * 4. LocalMin = min(repaintW, repaintB)로 전역 최소(best)값을 갱신
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

const [n, m] = input[0].split(' ').map(Number);
const board = input.slice(1).map(s => s.trim().split(''));

function countRepaintWhenStartW(board, r, c) {
    let repaint = 0;
    for (let i = 0; i < 8; i++) {
        for (let j = 0; j < 8; j++) {
            const cur = board[r + i][c + j];
            const expect = ((i + j) % 2 === 0) ? 'W' : 'B';
            if (cur !== expect) repaint++;
        }
    }
    return repaint;
}

let best = 32;
for (let r = 0; r <= n - 8; r++) {
    for (let c = 0; c <= m - 8; c++) {
        const repaintW = countRepaintWhenStartW(board, r, c);
        const repaintB = 64 - repaintW;
        const localMin = Math.min(repaintW, repaintB);
        if (localMin < best) best = localMin;
    }
}

console.log(best);