package ca.ucalgary.ensf380;

public class Hardcover extends Book {
    private String binding;

    public Hardcover(String isbn, int publicationYear, int pages, String binding) {
        super(isbn, publicationYear, pages);
        this.binding = binding;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String details() {
        return "Method details called from Hardcover";
    }
}


