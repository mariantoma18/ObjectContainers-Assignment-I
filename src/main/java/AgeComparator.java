import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    // Method used to compare two ages
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}
