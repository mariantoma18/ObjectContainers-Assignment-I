import java.util.List;

public class Hobby {

  private String name;
  private int frequency;
  private List<Address> address;

  public Hobby(String name, int frequency, List<Address> address) {
    this.name = name;
    this.frequency = frequency;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public int getFrequency() {
    return frequency;
  }

  public List<Address> getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "Hobby{"
        + "countryName='"
        + name
        + '\''
        + ", frequency="
        + frequency
        + ", address="
        + address
        + '}';
  }
}
