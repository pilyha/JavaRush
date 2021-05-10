package fifthteen;

import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";

            //Add your code here
            if (this instanceof MarkTwainBook) {output = markTwainOutput;}
            else output = agathaChristieOutput;

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book{
        String title = null;
        public MarkTwainBook(String title) {

            super("Mark Twain");
            this.title = title;

        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static class AgathaChristieBook extends Book{

        String title = null;
        public AgathaChristieBook(String title) {

            super("Agatha Christie");
            this.title = title;

        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }}