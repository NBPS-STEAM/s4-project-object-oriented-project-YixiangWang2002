import java.util.UUID;

/**
 * Library Property - Book
 */
public class Book extends LibraryProperty {
    private String title;
    private String author;
    private String publisher;

    /**
     * Default Constructor
     */
    public Book() {
        this.title = null;
        this.author = null;
        this.publisher = null;
        this.setLibraryPropertyId(UUID.randomUUID().toString());
        this.setLibraryPropertyType(PropertyType.BOOK);
    }

    /**
     * Constructor with id as input
     * @param id
     * @param title
     * @param author
     * @param publisher
     */
    public Book(String id, String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.setLibraryPropertyId(id);
        this.setLibraryPropertyType(PropertyType.BOOK);
    }

    /**
     * Constructor without id as input
     * @param title
     * @param author
     * @param publisher
     */
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.setLibraryPropertyId(UUID.randomUUID().toString());
        this.setLibraryPropertyType(PropertyType.BOOK);
    }

    /**
     * Getter for title
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for author
     * @return
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Setter for author
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter for publisher
     * @return
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Setter for publisher
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
