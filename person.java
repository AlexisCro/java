import java.util.HashMap;

public class person {
  // Define attributes
  private String firstName;
  private String lastName;
  public state civilStatus;

  // A client can have multiple accounts
  private HashMap<Long, account> accounts = new HashMap<Long, account>();

  enum state {
    MARRIED,
    SINGLE,
    DIVORCED,
    ALTERNATE
  }

  // Constructor
  public person(String firstName, String lastName, state civilStatus) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.civilStatus = civilStatus;
  }

  public person() {
    this.firstName = "";
    this.lastName = "";
  };

  // getters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public HashMap<Long, account> getAccounts() {
    return accounts;
  }

  // setters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // Redefine toString to render fullname
  @Override 
  public String toString() {
    return this.firstName + " " + this.lastName;
  }
}
