import java.util.ArrayList;
import java.util.List;

class App {
  public static void main(String[] args) {
    List<Property> bergerCountryLibraryProperties = new ArrayList<>();
    Property book1 = new Book();
    Property book2 = new Book("123", "Test Book Title 1", "John Smith", "Century 1019");
    Property book3 = new Book("Test Book Title 2", "Kate Perry", "CyberBook 2088");

    Property dvd1 = new DVD();
    Property dvd2 = new DVD("321", "Test Dvd Title 1", "John Smith Studio");
    Property dvd3 = new DVD("Test dVD Title 2","CyberBook 2088");

    bergerCountryLibraryProperties.add(book1);
    bergerCountryLibraryProperties.add(book2);
    bergerCountryLibraryProperties.add(book3);

    bergerCountryLibraryProperties.add(dvd1);
    bergerCountryLibraryProperties.add(dvd2);
    bergerCountryLibraryProperties.add(dvd3);

    for(Property libraryProperty : bergerCountryLibraryProperties) {
      libraryProperty.displayInfo();
    }
  }
}