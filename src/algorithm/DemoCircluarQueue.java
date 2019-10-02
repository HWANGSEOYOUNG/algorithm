package algorithm;

import java.util.Arrays;

class CircluarQueue {
    private int head;
    private int tail;
    private int maxSize;

    CircluarQueue() { //생성자
        this.head = 0;
        this.tail = 0;
    }

    public String[] makeCirQueue(int n) {
        this.maxSize = n;
        String[] cirQueue = new String[n];

        return cirQueue;
    }

    public boolean isEmpty() {
        if (head == tail) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFully() {
        if (tail > head) {
            if (maxSize - 1 == tail - head) {
                return true;
            } else {
                return false;
            }
        } else { // head가 tail 보다 클 때
            if ((head - tail) == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

    public void addTail(String[] cirQueue, String input) {
        if (isEmpty() == true) {
            cirQueue[tail] = input;
            this.head = tail;
            this.tail++;
        } else if (isFully() == true) {
            removeHead(cirQueue);
            if (tail == maxSize - 1) {
                tail = 0;
            }
            cirQueue[tail] = input;
            this.head = tail;
            this.tail++;
        }else {
            cirQueue[tail] = input;
            this.head = tail;
            this.tail++;
        }

    }


    public void removeHead(String[] cirQueue) {

    }

}


public class DemoCircluarQueue {
    public static void main(String[] args) {
        String[] cirQueue;
        CircluarQueue cirQue = new CircluarQueue();
        cirQueue = cirQue.makeCirQueue(6);
        cirQue.addTail(cirQueue,"A");
        cirQue.addTail(cirQueue,"B");
        cirQue.addTail(cirQueue,"C");
        cirQue.addTail(cirQueue,"D");
        cirQue.addTail(cirQueue,"E");
        cirQue.addTail(cirQueue,"안돼");

        System.out.println(Arrays.toString(cirQueue));
    }
}
