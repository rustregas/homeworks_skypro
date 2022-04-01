package pro.sky.java.course1.lesson1;

public class Library {
    int size;
    private Book[] books;

    public Library(int size){
        this.size = size;
        this.books = new Book[size];
    }

    public void addBook(Book book){
        boolean successAdded = false;
        int a = books.length;
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null){
                successAdded = true;
                books[i] = book;
                break;
            }
        }
        if(!successAdded){
            throw new RuntimeException("В массиве книг нет свободного места");
        }

    }

    public void getInfo(){
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }

    public void getInfo(String bookName){
        boolean successFindBook = false;
        for (Book book : books) {
            if (book != null && book.getBookName().equals(bookName)) {
                System.out.printf("%s by %s was published in %d\n", book.getBookName(), book.getAuthor(), book.getPublishingYear());
                successFindBook = true;
                break;
            }
        }
        if(!successFindBook){
            System.out.printf("Book '%s' not found\n", bookName);
        }
    }

    public void setPublishYear(String bookName, int year){
        boolean successFindBook = false;
        for (Book book : books) {
            if (book != null && book.getBookName().equals(bookName)) {
                book.setPublishingYear(year);
                successFindBook = true;
                break;
            }
        }
        if(!successFindBook){
            throw new IllegalArgumentException("Book " + bookName + " not found\n");
        }
    }

}
