package comjava.udemy.designpattern.structural.bridge;

public class Main {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new ArrayLinkedList<>());

        collection.offer(1);
        collection.poll();
    }
}
