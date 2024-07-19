//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ca.ucalgary.ensf380;

public class MyBook {
    public MyBook() {
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("ClassicBooks Publishing", "123 Classic St.");

        Author author1 = new Author("Jane Austen", "Steventon, Hampshire", 41);
        Author author2 = new Author("Herman Melville", "New York City, New York", 72);
        Author author3 = new Author("F. Scott Fitzgerald", "Saint Paul, Minnesota", 44);
        Author author4 = new Author("Yuval Noah Harari", "Kiryat Ata, Israel", 48);

        Classic book1 = new Classic("ISBN123", 2020, 300, 1860, author1);
        Classic book2 = new Classic("ISBN456", 2021, 635, 1851, author2);

        Fiction fictionBook = new Fiction("ISBN789", 1925, 180, "Drama", author3);
        Nonfiction nonfictionBook = new Nonfiction("ISBN012", 2014, 443, "History", author4);

        publisher.setClassicsCatalog(new Classic[]{book1, book2});


        System.out.println(publisher.printLetterhead());
        System.out.println(book1.details());
        System.out.println(book2.details());
        System.out.println(fictionBook.details());
        System.out.println(nonfictionBook.details());
    }
}
