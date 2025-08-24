/**
 * 1. 그리디 알고리즘
 * 2. 국소적으로는 최선의 선택이지만 전체적으로는 최적이 아닐 수 있음
 *    동전 종류가 1, 6, 10원이고 12원을 만들어야 하는 경우
 * 3. 다이나믹 프로그래밍을 사용하면 해결
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

let [N, M] = input[0].split(' ').map(Number);

// const coins = [];
// for (let i = 1; i <= N; i++) {
//     coins.push(+input[i]);
// }

// let count = 0;
// for(let i = coins.length - 1; i >= 0; i--) {
//     if (coins[i] <= M) {        
//         const share = Math.floor(M / coins[i]);
//         count += share;
//         M -= share * coins[i];
//     }
// }

// console.log(count);

function findMinCoins(coins, amount) {
    const dp = new Array(amount + 1).fill(Infinity);
    dp[0] = 0;

    for (let i = 1; i <= amount; i++) {
        for (const coin of coins) {
            if (i >= coin) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount] === Infinity ? -1 : dp[amount];
}

const coins = [];
for (let i = 1; i <= N; i++) {
    coins.push(+input[i]);
}

console.log(findMinCoins(coins, M));