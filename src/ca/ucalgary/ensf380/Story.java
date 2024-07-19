package ca.ucalgary.ensf380;

public class Story {
    private String plot;
    private Author[] theAuthor;

    public Story(String plot, Author[] theAuthor) {
        this.plot = plot;
        this.theAuthor = theAuthor;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Author[] getTheAuthor() {
        return theAuthor;
    }

    public void setTheAuthor(Author[] theAuthor) {
        this.theAuthor = theAuthor;
    }

    public String details() {
        return "Method details called from Story";
    }
}