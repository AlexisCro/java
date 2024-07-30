import java.util.HashMap;

public class transaction {
  static int counter = 0;
  static HashMap<Integer, String> transactions = new HashMap<Integer, String>();
  private String transaction;

  public transaction(String transaction) {
    this.transaction = transaction;
  }

  public transaction() {};

  public void setTransaction() {
    counter++;
    this.transactions.put(counter, this.transaction);
  }

  public void getTransactions() {
    for (Integer key : transactions.keySet()) {
      System.out.println("Transaction : " + key + " " + transactions.get(key));
    }
  }
}
