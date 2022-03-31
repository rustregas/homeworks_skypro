package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author kyte = new Author("Thomas", "Kyte");
        Author orwell = new Author("George", "Orwell");

        Book book1 = new Book("Expert Oracle", kyte, 2018);
        Book book2 = new Book("1984", orwell, 2018);

        book2.setPublishingYear(2005);

        System.out.println("Book name: " + book1.getBookName() + "\nPublishing Year: " + book1.getPublishingYear() + "\nAuthor: " + book1.getAuthor().getFullName() + "\n");
        System.out.println("Book name: " + book2.getBookName() + "\nPublishing Year: " + book2.getPublishingYear() + "\nAuthor: " + book2.getAuthor().getFullName() + "\n");
    }
}
