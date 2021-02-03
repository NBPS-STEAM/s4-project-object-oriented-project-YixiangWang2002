/**
 *
 * Abstract class LibraryProperty
 * Define the generic properties
 */
public abstract class LibraryProperty implements Property {
    private String libraryPropertyId;
    private PropertyType libraryPropertyType;

    @Override
    public void displayInfo() {
        System.out.println("libraryPropertyId: " + libraryPropertyId + ", libraryPropertyType: " + libraryPropertyType.toString());
    }

    @Override
    public String getProperId() {
        return this.libraryPropertyId;
    }

    /**
     * Getter for libraryPropertyId
     * @return libraryPropertyId
     */
    public String getLibraryPropertyId() {
        return this.libraryPropertyId;
    }

    /**
     * Setter for libraryPropertyId
     * @param libraryPropertyId
     */
    public void setLibraryPropertyId(String libraryPropertyId) {
        this.libraryPropertyId = libraryPropertyId;
    }

    /**
     * Getter for libraryPropertyType
     * @return libraryPropertyType
     */
    public PropertyType getLibraryPropertyType() {
        return this.libraryPropertyType;
    }

    /**
     * Setter for libraryPropertyType
     * @param libraryPropertyType
     */
    public void setLibraryPropertyType(PropertyType libraryPropertyType) {
        this.libraryPropertyType = libraryPropertyType;
    }
}
