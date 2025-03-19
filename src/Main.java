public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();

        list.append('1');
        list.append('2');
        list.append('3');
        list.append('4');
        list.printList();

        System.out.println("Довжина списку: " + list.length());
        list.insert('a', 2);
        list.printList();

        char res = list.delete(2);
        System.out.println(res);
        list.printList();

        list.append('e');
        list.append('e');
        list.append('e');
        list.append('e');
        list.printList();
        list.deleteAll('e');
        list.printList();

    }
}
