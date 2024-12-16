import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

  // Method used to compare two names
  @Override
  public int compare(Person person1, Person person2) {
    return person1.getName().compareTo(person2.getName());
  }
}
