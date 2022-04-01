package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author kyte = new Author("Thomas", "Kyte");
        Author orwell = new Author("George", "Orwell");

        Book book1 = new Book("Expert Oracle", kyte, 2018);
        Book book2 = new Book("1984", orwell, 2018);

        book2.setPublishingYear(2005);

        System.out.println(kyte.toString());
        System.out.println(book1.toString());
    }
}
