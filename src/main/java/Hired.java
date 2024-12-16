public class Hired extends Person {

  public Hired(String name, int age) {
    super(name, age);
  }

  @Override
  public String toString() {
    return "Hired{" + "name='" + super.getName() + '\'' + ", age=" + super.getAge() + '}';
  }
}
