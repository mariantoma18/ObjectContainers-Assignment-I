import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Creating addresses to practice hobbies
    Address address1 = new Address("Brasov", "Romania");
    Address address2 = new Address("Paris", "France");
    Address address3 = new Address("Amsterdam", "Netherlands");
    Address address4 = new Address("Roma", "Italy");

    // Lists of addresses where the hobbies can be practiced
    List<Address> trailRunningAddresses = new ArrayList<>();
    trailRunningAddresses.add(address1);
    trailRunningAddresses.add(address2);

    List<Address> streetRunningAddresses = new ArrayList<>();
    streetRunningAddresses.add(address1);
    streetRunningAddresses.add(address2);
    streetRunningAddresses.add(address3);
    streetRunningAddresses.add(address4);

    List<Address> swimmingAddresses = new ArrayList<>();
    swimmingAddresses.add(address2);
    swimmingAddresses.add(address4);

    List<Address> cyclingAddresses = new ArrayList<>();
    cyclingAddresses.add(address3);
    cyclingAddresses.add(address4);

    List<Address> footballAddresses = new ArrayList<>();
    footballAddresses.add(address1);
    footballAddresses.add(address2);
    footballAddresses.add(address3);

    // Creating hobbies
    Hobby trailRunning = new Hobby("Trail Running", 3, trailRunningAddresses);
    Hobby streetRunning = new Hobby("Street Running", 5, streetRunningAddresses);
    Hobby swimming = new Hobby("Swimming", 1, swimmingAddresses);
    Hobby cycling = new Hobby("Cycling", 2, cyclingAddresses);
    Hobby football = new Hobby("Football", 1, footballAddresses);

    // Creating persons
    Person person1 = new Person("Bogdan", 27);
    Person person2 = new Student("Claudiu", 41);
    Person person3 = new Hired("Alexandru", 34);

    // Persons sorted by name
    NameComparator nameComparator = new NameComparator();
    Set<Person> set1 = new TreeSet<>(nameComparator);
    set1.add(person1);
    set1.add(person2);
    set1.add(person3);

    // Persons sorted by age
    AgeComparator AgeComparator = new AgeComparator();
    Set<Person> set2 = new TreeSet<>(AgeComparator);
    set2.add(person1);
    set2.add(person2);
    set2.add(person3);

    // Print the name and the age
    System.out.println("---Persons sorted by name---");
    for (Person person : set1) {
      System.out.println(person);
    }
    System.out.println("--------------------------------");

    // Adding hobbies to each person
    List<Hobby> bogdansHobbies = new ArrayList<>();
    bogdansHobbies.add(trailRunning);
    bogdansHobbies.add(streetRunning);

    List<Hobby> claudiusHobbies = new ArrayList<>();
    claudiusHobbies.add(football);
    claudiusHobbies.add(swimming);

    List<Hobby> alexandrusHobbies = new ArrayList<>();
    alexandrusHobbies.add(cycling);
    alexandrusHobbies.add(streetRunning);

    // Creating a HashMap that holds a list of hobbies for each person
    HashMap<Person, List<Hobby>> personsHobbiesList = new HashMap<>();
    personsHobbiesList.put(person1, bogdansHobbies);
    personsHobbiesList.put(person2, claudiusHobbies);
    personsHobbiesList.put(person3, alexandrusHobbies);

    /*
     * For each person in personHobbiesList, a new hobbies list is created, then a StringBuilder for hobby names and one for addresses;
     * Specific information about the hobbies is then added to those StringBuilders;
     * StringBuilder is used here just for printing, so ArrayList is no longer needed to store the information in memory;
     * At the end, the person's name, the hobbies, and the addresses where the hobbies can be practiced are printed.
     */
    for (Person person : personsHobbiesList.keySet()) {
      List<Hobby> hobbiesList = personsHobbiesList.get(person);
      StringBuilder hobbyNames = new StringBuilder();
      StringBuilder hobbyAddresses = new StringBuilder();
      for (Hobby hobby : hobbiesList) {
        hobbyNames.append(" - " + hobby.getName());
        hobbyAddresses.append(" - " + hobby.getAddress().toString());
      }
      System.out.println(
          person.getName()
              + "'s hobbies: "
              + hobbyNames
              + "; "
              + "\nThe hobbies can be practiced in: "
              + hobbyAddresses
              + "\n");
    }
  }
}
