package pro.sky.java.course1.lesson1;

public class Main {

    public static void main(String[] args) {

        Library library = new Library(2);

        Author kyte = new Author("Thomas", "Kyte");
        Author orwell = new Author("George", "Orwell");

        Book book1 = new Book("Expert Oracle", kyte, 2018);
        Book book2 = new Book("1984", orwell, 2018);

        library.addBook(book1);
        library.addBook(book2);

        library.getInfo();
        System.out.println();
        library.getInfo("1984");
        System.out.println();
        library.setPublishYear("1984", 1900);
        library.getInfo("1984");
    }
}
