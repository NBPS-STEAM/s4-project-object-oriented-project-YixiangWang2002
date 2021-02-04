import java.util.UUID;

/**
 * Library Property - DVD
 */
public class DVD extends LibraryProperty
{
    private String title;
    private String producer;

    /**
     * Default Constructor
     */
    public DVD() {
        this.title = null;
        this.producer = null;
        this.setLibraryPropertyId(UUID.randomUUID().toString());
        this.setLibraryPropertyType(PropertyType.DVD);
    }

    /**
     * Constructor with id as input
     * @param id
     * @param title
     * @param producer
     */
    public DVD(String id, String title, String producer) {
        this.title = title;
        this.producer = producer;
        this.setLibraryPropertyId(id);
        this.setLibraryPropertyType(PropertyType.DVD);
    }

    /**
     * Constructor without id as input
     * @param title
     * @param producer
     */
    public DVD(String title, String producer) {
        this.title = title;
        this.producer = producer;
        this.setLibraryPropertyId(UUID.randomUUID().toString());
        this.setLibraryPropertyType(PropertyType.DVD);
    }

    /**
     * Getter for title
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Getter for producer
     * @return
     */
    public String getProducer() {
        return this.producer;
    }

    /**
     * Setter for title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Setter for producer
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
