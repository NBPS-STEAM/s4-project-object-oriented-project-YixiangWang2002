import java.util.ArrayList;
import java.util.List;

class App {
  public static void main(String[] args) {

    // List instance to store all properties
    List<Property> bergerCountryLibraryProperties = new ArrayList<>();

    //Create 3 Book instances with 3 diff constructors
    Property book1 = new Book();
    LibraryProperty book2 = new Book("123", "Test Book Title 1", "John Smith", "Century 1019");
    Book book3 = new Book("Test Book Title 2", "Kate Perry", "CyberBook 2088");

    //Create 3 DVD instances with 3 diff constructors
    Property dvd1 = new DVD();
    LibraryProperty dvd2 = new DVD("321", "Test Dvd Title 1", "John Smith Studio");
    DVD dvd3 = new DVD("Test dVD Title 2","CyberBook 2088");

    // Test Getters and Setters
    System.out.println("book1.getProperId():" + book1.getProperId());
    System.out.println("Before:");
    book3.displayInfo();
    System.out.println("After:");
    book3.setLibraryPropertyId("book3Id");
    book3.displayInfo();

    System.out.println("dvd1.getProperId():" + dvd1.getProperId());
    System.out.println("Before:");
    dvd3.displayInfo();
    System.out.println("After:");
    dvd3.setProducer("my producer");
    dvd3.displayInfo();

    // Add all Books to List
    bergerCountryLibraryProperties.add(book1);
    bergerCountryLibraryProperties.add(book2);
    bergerCountryLibraryProperties.add(book3);

    // Add all DVDs to List
    bergerCountryLibraryProperties.add(dvd1);
    bergerCountryLibraryProperties.add(dvd2);
    bergerCountryLibraryProperties.add(dvd3);

    // Call displayInfo()
    System.out.println("\n");
    for(Property libraryProperty : bergerCountryLibraryProperties) {
      libraryProperty.displayInfo();
    }
  }
}