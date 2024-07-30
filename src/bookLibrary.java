class Library1{
    String[]books;
    int no_of_books;
    Library1(){
        this.books =new String[100];
        this.no_of_books= 0;
    }
    void addBook(String book){
        this.books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+": has been added");
    }
    void showAvailableBook(){
        System.out.println("Available Books");
        for(String book : this.books){
            if (book==null)
                continue;
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){
            for (int i=0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println( book +": The books has been issue");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("this book is not exist");

    }
    void returnBook(String book){
        addBook(book);


    }
}
public class bookLibrary {
    public static void main(String[] args) {
        // you have to implement to library using java class library
        // Method : addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books.
        // Array to store the issued books.

        Library1 lab =new Library1();
        lab.addBook("Rich Daddy");
        lab.addBook("World Tour");
        lab.addBook("java core");
        lab.addBook("Money Earn");
        lab.showAvailableBook();

        lab.issueBook("java core");
        lab.showAvailableBook();

        lab.returnBook("java Core");
        lab.showAvailableBook();

    }
}
