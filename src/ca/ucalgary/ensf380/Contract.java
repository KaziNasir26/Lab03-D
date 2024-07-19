//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ca.ucalgary.ensf380;

public class Contract {
    private String date;
    private Publisher publisherInfo;
    private Author[] authorInfo;

    public Contract(String date, Publisher publisherInfo, Author[] authorInfo) {
        this.date = date;
        this.publisherInfo = publisherInfo;
        this.authorInfo = authorInfo;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Publisher getPublisherInfo() {
        return this.publisherInfo;
    }

    public void setPublisherInfo(Publisher publisherInfo) {
        this.publisherInfo = publisherInfo;
    }

    public Author[] getAuthorInfo() {
        return this.authorInfo;
    }

    public void setAuthorInfo(Author[] authorInfo) {
        this.authorInfo = authorInfo;
    }

    public String details() {
        return "Method details called from Contract";
    }
}
