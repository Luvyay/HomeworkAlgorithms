package Lesson3;

public class MainClassLesson {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.reverse();
        list.add(5);
        list.reverse();
        list.print();
        list.add(2);
        list.add(1);
        list.add(3);
        list.print();
        list.reverse();
        list.print();
    }
}
