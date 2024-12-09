import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        Person person1 = new Person("Bogdan",27);
        Person person2 = new Person("Claudiu", 41);
        Person person3 = new Person("Alexandru", 34);

        //Sorted by name
        NameComparator nameComparator = new NameComparator();
        Set<Person> set1 = new TreeSet<>(nameComparator);
        set1.add(person1);
        set1.add(person2);
        set1.add(person3);

        System.out.println(set1);

        //Sorted by age
        AgeComparator AgeComparator = new AgeComparator();
        Set<Person> set2 = new TreeSet<>(AgeComparator);
        set2.add(person1);
        set2.add(person2);
        set2.add(person3);

        System.out.println(set2);
  }
}
