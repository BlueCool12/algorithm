/**
 * 1. 링크드 리스트를 이용한 구현
 * 2. 링크드 리스트를 사용하면 중간 삽입 삭제가 효율적
 */

const fs = require('fs');
// const input = require('fs').readFileSync(0).toString().trim().split('\n');
const input = fs.readFileSync('./input.txt').toString().trim().split('\n');

class Node {
    constructor(value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = new Node('head');
        this.tail = new Node('tail');
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.cursor = this.tail;
    }

    insert(value) {
        const newNode = new Node(value);
        const prevNode = this.cursor.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = this.cursor;
        this.cursor.prev = newNode;
    }

    delete() {
        if (this.cursor.prev === this.head) return;

        const prevNode = this.cursor.prev;
        const prevPrevNode = prevNode.prev;

        prevPrevNode.next = this.cursor;
        this.cursor.prev = prevPrevNode;
    }

    moveLeft() {
        if (this.cursor.prev === this.head) return;
        this.cursor = this.cursor.prev;
    }

    moveRight() {
        if (this.cursor === this.tail) return;
        this.cursor = this.cursor.next;
    }

    getFinalString() {
        let result = '';
        let currentNode = this.head.next;
        while (currentNode !== this.tail) {
            result += currentNode.value;
            currentNode = currentNode.next;
        }
        return result;
    }
}

const word = input[0];
const M = +input[1];
const commands = input.slice(2);

const editor = new LinkedList();
for (const char of word) {
    editor.insert(char);
}

for (const command of commands) {
    const [cmd, arg] = command.split(' ');
    if (cmd === 'L') {
        editor.moveLeft();
    } else if (cmd === 'D') {
        editor.moveRight();
    } else if (cmd === 'B') {
        editor.delete();
    } else if (cmd === 'P') {
        editor.insert(arg);
    }
}

console.log(editor.getFinalString());