package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    private Story[] stories;

    public Anthology(String isbn, int publicationYear, int pages, String genre, Author theAuthor, Story[] stories) {
        super(isbn, publicationYear, pages, genre, theAuthor);
        this.stories = stories;
    }

    public Story[] getStories() {
        return stories;
    }

    public void setStories(Story[] stories) {
        this.stories = stories;
    }

    @Override
    public String details() {
        return "Method details called from Anthology";
    }
}