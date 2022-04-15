class Account
{
    static int balance = 1000;

    static int getBalance()
    {
        return balance;
    }    

    static int withdraw( int amount)
    {
        balance = balance - amount ;
        return balance ;
    }
}

class AccountOverdrawDemo extends Account implements Runnable
{
       @Override
    public void run() {
        for( int i=0 ; i<5 ; i++)
        {
            makeWithdrawal(100);
            
            if( Account.getBalance() < 0)
                System.out.println("account is overdrawn!");
        }
        
    }
    void makeWithdrawal(int amt)
    {
        if (Account.getBalance() >= amt)
        {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw "+amt+", current balance : "+Account.getBalance());    
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println("An Error Occurred!!");
            ex.printStackTrace();
        }
        Account.withdraw(amt);
        System.out.println(Thread.currentThread().getName() + " completes the withdrawal, remaining balance : "+Account.getBalance());
        } 
        else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw, current balance : " + Account.getBalance());
        }    
    }

}

class AccountOverdrawSafeDemo extends Account implements Runnable {


    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(100);
            if (Account.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (Account.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw "+amt+", current balance : "+Account.getBalance());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("An error occurred!!");
            }
            Account.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal, remaining balance : "+Account.getBalance());
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw, current balance : " + Account.getBalance());
        }
    }
}

class Bank
{
    public static void main(String[] args) {
        AccountOverdrawSafeDemo acnt = new AccountOverdrawSafeDemo();

        Thread one = new Thread(acnt);
        Thread two = new Thread(acnt);
        one.setName("Goutam");
        two.setName("Atharv");
        two.setPriority(10);
        one.start();
        two.start();
    }
}