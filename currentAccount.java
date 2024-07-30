public class currentAccount extends account{
  // Define attributes
  private Double uncovered;

  // Constructor
  public currentAccount(Double balance, person client) {
    super(
      balance,
      client
    );
    
    this.uncovered = 0.0;
  }

  public currentAccount() {
    super();
    this.uncovered = 0.0;
  }

  public void setUncovered(Double uncovered) {
    this.uncovered = uncovered;
  }

  @Override
  public void getMoney(Double amount, Double check) {
    if ((this.balance - amount) < check) {
      setBalance(this.balance - amount);
      System.out.println("Your new amount on your account is  " + getBalance() + "€");
      transaction newTransaction = new transaction("Withdraw from " + this.getClass() + " " + this.accountNumber + " of " + amount);
      newTransaction.setTransaction();
    } else {
      System.out.println("Not enough money");
    }
  }
}
