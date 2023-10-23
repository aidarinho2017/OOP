public class Account {
    private double balance;
    private int accountNumber;
    public Account(int a){
        balance = 0.0;
        accountNumber = a;
    }
    public void deposit(double sum){
        balance += sum;
    }
    public void withdraw(double sum){
        balance-=sum;
    }
    public double getBalance(){
        return balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void transfer(double sum, Account other){
        if(balance < sum){
            System.out.println("You don't have enough money to perform this operation. ");
        }
        else{
            balance -= sum;
            other.deposit(sum);
        }
    }
    public String toString() {
        return "Amount of money on bank account is: " + balance + ". Account number is: " + accountNumber + '.';
    }
    public final void print(){
        System.out.println(toString());
    }


}
