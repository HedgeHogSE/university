package test_oop;

public class test5Book {
    public static void main(String[] args) {
        Book book =  new Book("A clockwork orange", "Anthony Burgess", 100, false);
        System.out.println(book.numLines());
        System.out.println(book.numLines(50));
        System.out.println(book.bookInfo());
    }
}
