class He {
    int balance = 1000;

    public synchronized void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(threadName + " is going to withdraw " + amount);
            try {
                Thread.sleep(1000); // Simulate time taken to process
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            balance -= amount;
            System.out.println("Balance after withdrawal by " + threadName + ": " + balance);
        } else {
            System.out.println(threadName + " cannot withdraw " + amount + " due to insufficient balance. Current Balance: "
                    + balance);
        }
    }
}

class WithdrawalThread extends Thread {
    He account;
    int amount;

    WithdrawalThread(He account, int amount, String name) {
        super(name);  // Set thread name
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class Mt3 {
    public static void main(String[] args) {
        //Hee sharedAccount = new Hee();
          He sharedAccount= new He();
        WithdrawalThread A = new WithdrawalThread(sharedAccount, 800, "Thread A");
        WithdrawalThread B = new WithdrawalThread(sharedAccount, 500, "Thread B");

        A.start();
        B.start();
    }
}
