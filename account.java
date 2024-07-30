public abstract class account {
  // Define attributes
  final protected Long accountNumber;
  protected Double balance;

  static Long counter = 0L;

  // An account belongs to a client
  protected person client;

  // Constructor
  public account(Double balance, person client) {
    counter++;
    this.accountNumber = counter;
    this.balance = balance;
    this.client = client;
  }

  public account() {
    counter++;
    this.accountNumber = counter;
  }

  // getters
  public Long getAccountNumber() {
    return accountNumber;
  }

  public Double getBalance() {
    return balance;
  }

  public person getClient() {
    return client;
  }

  // setters
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public void setClient(person client) {
    this.client = client;
  }

  public void getMoney(Double amount, Double check) {
    if ((this.balance - amount) < check) {
      setBalance(this.balance - amount);
      transaction newTransaction = new transaction("Withdraw from " + this.getClass() + " " + this.accountNumber + " of " + amount);
    } else {
      System.out.println("Not enough money");
    }
  }

  // Put money
  public void depositMoney(Double amount) {
    setBalance(this.balance + amount);
    transaction newTransaction = new transaction("Deposit " + amount + " onto " + this.getClass() + " " + this.accountNumber);
    newTransaction.setTransaction();
  }

  public void transferMoney(account account, Double amount) {
    if ((this.balance - amount) < 0) {
      System.out.println("Not enough money");
    } else {
      setBalance(this.balance - amount);
      account.setBalance(account.getBalance() + amount);
      transaction newTransaction = new transaction("Transfer from " + this.getClass() + " " + this.accountNumber + " to " + account.getClass() + " " + account.getAccountNumber() + " of " + amount);
      newTransaction.setTransaction();
    }
  }
}
