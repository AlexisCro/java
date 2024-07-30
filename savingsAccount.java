public class savingsAccount extends account{
  private Double gain;


  public savingsAccount(Double balance, Double gain, person client) {
    super(
      balance,
      client
    );

    this.gain = gain;
  }

  public savingsAccount() {
    super();
    this.gain = 0.0;
  }

  public Double getGain() {
    return gain;
  }

  public void setGain(Double gain) {
    this.gain = gain;
  }
}
