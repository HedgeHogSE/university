package test_oop;

public class Book {
    String nameBook;
    String nameAuthor;
    int page;
    boolean doc;
    public Book(String nameBook, String nameAuthor, int page, boolean doc){
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.page = page;
        this.doc = doc;
    }
    public int numLines(){
        return (this.page * 40);
    }
    public int numLines(int countRows){
        return (this.page * countRows);
    }
    public String bookInfo(){
        return (String.format("%s от %s - %s", this.nameBook, this.nameAuthor, this.doc ? "Документальная" : "Недокументальная"));
    }
}

