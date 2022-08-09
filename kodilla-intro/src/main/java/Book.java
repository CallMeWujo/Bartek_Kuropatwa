public class Book {
    private  String author;

    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    private static Book of(String author, String title) {
        Book book = new Book(author,title);
        return book;
    }
    public static void main(String[] args) {
        Book book = Book.of("Drew Karpyshyn", "Darth Bane - Zasada Dwóch");
        System.out.println(book.author + ": " + book.title);

    }


}

