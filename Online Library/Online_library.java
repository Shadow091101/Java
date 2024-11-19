class Library {
    int no_of_books;
    String[] bookName;


    Library() {
        this.bookName = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String bookName) {
        this.bookName[no_of_books] = bookName;
        no_of_books++;
        System.out.println(bookName + "has been added!");
        showAvailableBooks();
    }

    void issueBook(String bookName) {
        for (int i = 0; i < this.bookName.length; i++) {
            if (this.bookName[i].equals(bookName)) {
                System.out.println(" The " + bookName + " book has been issued! ");
                this.bookName[i] = null;
                showAvailableBooks();
                break;
            }

        }
        System.out.println("There is no such book of the name you provided");
    }

    void returnBook(String bookName) {
        addBook(bookName);
    }

    void showAvailableBooks() {
        System.out.println("Available Books are : ");
        for (String s : bookName) {
            if (s == null) {
                continue;
            }
            System.out.println(" * " + s);
        }
    }
}

public class Online_library {
    public static void main(String[] args) {
        Library L = new Library();
        L.addBook("Hello world ");
        L.addBook("Book1");
        L.addBook("Book2");
        L.addBook("Book3");
        L.addBook("Book4");
        L.issueBook("Book1");
        L.returnBook("Book1");
    }
}
