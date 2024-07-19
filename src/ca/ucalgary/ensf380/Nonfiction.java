package ca.ucalgary.ensf380;

public class Nonfiction extends Book {
    private String topic;
    private Author author;

    public Nonfiction(String isbn, int publicationYear, int pages, String topic, Author author) {
        super(isbn, publicationYear, pages);
        this.topic = topic;
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String details() {
        return "Method details called from Nonfiction";
    }
}

