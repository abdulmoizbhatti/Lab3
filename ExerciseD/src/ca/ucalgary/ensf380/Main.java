/*
 * File Name: MyBook.java
 * Assignment: Lab 3 Exercise D
 * Completed by: Moiz Bhatti
 * Submission date: July 18th, 2024
 */

package ca.ucalgary.ensf380;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jimmy Michael", "433 Carbon Lane", 29);

        Publisher publisher = new Publisher("Creation Books", "55757 Book BLVD", new Classic[] {});

        Series series = new Series("Romance Series");

        Category fictionCategory = new Category("Fiction");
        Category romanceCategory = new Category("Romance");
        fictionCategory.setSubCategory(romanceCategory);

        Novel novel = new Novel("1234567890", 2024, 334, "Romance Cover", "Romance", author, series);
        Anthology anthology = new Anthology("0765376521", 2003, 420, "Fiction Series Cover", "Fiction", new Story[] {
            new Story(new Author[] { author })
        });

        Contract contract = new Contract("2024-07-18", publisher, author);

        System.out.println("Novel Details:");
        System.out.println("ISBN: " + novel.getIsbn());
        System.out.println("Publication Year: " + novel.getPublicationYear());
        System.out.println("Pages: " + novel.getPages());
        System.out.println("Cover Art: " + novel.getCoverArt());
        System.out.println("Genre: " + novel.getGenre());
        System.out.println("Author: " + novel.getTheAuthor().getName());
        System.out.println("Series: " + novel.getMySeries().getSeriesName());

        System.out.println("\nAnthology Details:");
        System.out.println("ISBN: " + anthology.getIsbn());
        System.out.println("Publication Year: " + anthology.getPublicationYear());
        System.out.println("Pages: " + anthology.getPages());
        System.out.println("Cover Art: " + anthology.getCoverArt());
        System.out.println("Genre: " + anthology.getGenre());
        System.out.println("Stories: 7");
        for (Story story : anthology.getStories()) {
            for (Author author1 : story.getTheAuthors()) {
                System.out.println("Author: " + author1.getName());
            }
        }

        System.out.println("\nContract Details:");
        System.out.println("Date: " + contract.getDate());
        System.out.println("Publisher: " + contract.getPublisherInfo().getName());
        System.out.println("Author: " + contract.getAuthorInfo().getName());

    }
}
