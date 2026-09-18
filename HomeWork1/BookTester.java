public class BookTester {

    public static void main(String[] args) {
        Book book0 = new Book("The Heart of the Betrayed", "400");
        Book book1 = new Book("One of as Kind", "500");
        System.out.println(book0);
        System.out.println(book1);

        Book[] books = new Book[2];
        books[0] = book0;
        books[1] = book1;

        for (int i = 0; i < 2; i++) {
            System.out.println(books[i]);
        }
    }
}
