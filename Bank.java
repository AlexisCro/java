import java.util.Scanner;

public class Bank {
  public static void main(String[] args) {
    enum actions {
      DEPOSIT,
      WITHDRAW,
      TRANSFER,
      CONSULT
    }

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the bank \n");
    System.out.println("Create an account or log in \n");
    person client = new person();

    System.out.println("Enter your first name: \n");
    String firstName = scanner.next();
    client.setFirstName(firstName);

    System.out.println("\n Enter your last name: \n");
    String lastName = scanner.next();
    client.setLastName(lastName);


    System.out.println("\n Enter your civil status by entering the num associated: \n");
    for (person.state state : person.state.values()) {
      System.out.println(state.ordinal() + " - " + state);
    }
    Integer civilStatus = scanner.nextInt();
    client.civilStatus = person.state.values()[civilStatus];

    transaction transactions = new transaction();
    currentAccount currentAccount = new currentAccount(0.0, client);
    savingsAccount savingsAccount = new savingsAccount(0.0, 0.1, client);
    currentAccount.setClient(client);
    savingsAccount.setClient(client);
    System.out.println("Welcome " + client.toString() + ", your account has been created \n");
    
    Integer action = 0;

    while (action < 4) {
      System.out.println("Which action do you to realize on your account: \n");
      for (actions actionIndex : actions.values()) {
        System.out.println(actionIndex.ordinal() + " - " + actionIndex);
      }
  
      action = scanner.nextInt();

      switch(action){
        case 0:
          System.out.println("Enter the account where you want to deposit: \n" + currentAccount.getAccountNumber() + " \n " + savingsAccount.getAccountNumber() + "\n");
          Long deposit = scanner.nextLong();

          if (deposit == currentAccount.getAccountNumber()) {
            System.out.println("Enter the amount you want to deposit: \n");
            Double amount = scanner.nextDouble();
            currentAccount.setBalance(currentAccount.getBalance() + amount);
          } else {
            System.out.println("Enter the amount you want to deposit: \n");
            Double amount = scanner.nextDouble();
            savingsAccount.setBalance(savingsAccount.getBalance() + amount);
          }
          break;
        case 1:
          System.out.println("Enter the account where you want to withdraw: \n" + currentAccount.getAccountNumber() + " \n " + savingsAccount.getAccountNumber() + "\n");
          Long withdraw = scanner.nextLong();

          if (withdraw == currentAccount.getAccountNumber()) {
            System.out.println("Enter the amount you want to withdraw: \n");
            Double amount = scanner.nextDouble();
            currentAccount.getMoney(amount, 0.0);
          } else {
            System.out.println("Enter the amount you want to withdraw: \n");
            Double amount = scanner.nextDouble();
            savingsAccount.getMoney(amount, 0.0);
          }
          break;
        case 2:
          System.out.println("Enter the account where you want to transfer: \n" + currentAccount.getAccountNumber() + " \n " + savingsAccount.getAccountNumber() + "\n");
          Long transfer = scanner.nextLong();

          if (transfer == currentAccount.getAccountNumber()) {
            System.out.println("Enter the amount you want to transfer: \n");
            Double amount = scanner.nextDouble();
            currentAccount.transferMoney(savingsAccount, amount);
          } else {
            System.out.println("Enter the amount you want to transfer: \n");
            Double amount = scanner.nextDouble();
            savingsAccount.transferMoney(currentAccount, amount);
          }
          break;
        case 3:
          System.out.println("Your current account balance is: " + currentAccount.getBalance() + "\n");
          System.out.println("Your savings account balance is: " + savingsAccount.getBalance() + "\n");
          transactions.getTransactions();
          break;
        default:
          System.out.println("Exit \n");
          break;
      }
    }
  }
}
