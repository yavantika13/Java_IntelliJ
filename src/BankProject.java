 abstract class Bankaccount
{
   private String accountholder;
   private double balance;

public double getBalance()
{
    return balance;
}
public void setBalance(double balance)
{
    this.balance = balance;
}
public String getAccountholder()
{
    return accountholder;
}
public void setAccountholder(String accountholder)
{
    this.accountholder = accountholder;
  }
  public Bankaccount(String accountholder, double balance)
  {
    this.accountholder = accountholder;
    this.balance = balance;
  }
  public void deposit(double amount)
  {
      if (amount > balance)
      {
          this.balance += balance;
      }
  }
  public void withdraw(double amount, double balance)
  {
    if(amount <= balance)
    {
    this.balance -= balance;
    }
    else
    {
        System.out.println("Insufficient funds.");
    }
   }
    abstract public void withdraw(double amount);
}
class savingaccount extends Bankaccount{
    public savingaccount(String accountholder, double balance){
        super(accountholder, balance);
    }
    public void withdraw(double amount){
        if(amount <= getBalance())
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw Successful");
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankProject {

    public static void main(String[] args) {
        Bankaccount bankaccount = new savingaccount("Avantika",10000);
        System.out.println("Saving accounts");
        System.out.println(bankaccount.getAccountholder());
        System.out.println(bankaccount.getBalance());
        bankaccount.deposit(10000);
        bankaccount.withdraw(10000);
    }
}
