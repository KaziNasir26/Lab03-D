//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ca.ucalgary.ensf380;

public class Classic extends Hardcover {
    private int origPubYear;
    private Author author;

    public Classic(String isbn, int publicationYear, int pages, int origPubYear, Author author) {
        super(isbn, publicationYear, pages, "Hardcover");
        this.origPubYear = origPubYear;
        this.author = author;
    }

    public int getOrigPubYear() {
        return this.origPubYear;
    }

    public void setOrigPubYear(int origPubYear) {
        this.origPubYear = origPubYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String details() {
        return "Method details called from Classic";
    }
}
