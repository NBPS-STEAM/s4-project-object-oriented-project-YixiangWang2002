import java.util.UUID;

public class DVD extends LibraryProperty
{
    private String title;
    private String producer;

    public DVD() {
        this.title = null;
        this.producer = null;
        this.setLibraryPropertyId(UUID.randomUUID().toString());
        this.setLibraryPropertyType(PropertyType.DVD);
    }

    public DVD(String id, String title, String producer) {
        this.title = title;
        this.producer = producer;
        this.setLibraryPropertyId(id);
        this.setLibraryPropertyType(PropertyType.DVD);
    }

    public DVD(String title, String producer) {
        this.title = title;
        this.producer = producer;
        this.setLibraryPropertyId(UUID.randomUUID().toString());
        this.setLibraryPropertyType(PropertyType.DVD);
    }

    public String getTitle() {
        return title;
    }

    public String getProducer() {
        return producer;
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
