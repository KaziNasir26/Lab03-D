//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ca.ucalgary.ensf380;

public class Fiction extends Book {
    private String genre;
    private Author author;

    public Fiction(String isbn, int publicationYear, int pages, String genre, Author author) {
        super(isbn, publicationYear, pages);
        this.genre = genre;
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String details() {
        return "Method details called from Fiction";
    }
}
