public class CheckingAccount extends Account{
    int numOfTransactions;
    int freeTransactions = 6;
    public CheckingAccount(int a){
        super(a);
        numOfTransactions = 0;
    }
    public void transfer(double amount, Account other)
    {
        if(numOfTransactions <= freeTransactions && freeTransactions > 0)
        {
            super.transfer(amount, other);
            freeTransactions--;
        }
        else
        {
            this.transferWithFee(amount, other);
        }
        this.numOfTransactions++;
    }
    public void transferWithFee(double amount, Account other){
        if(getBalance()>=amount+deductFee(amount)) {
            transfer(amount + deductFee(amount), other);
        }
        else{
            System.out.println("You don't have enough money to complete this transaction. ");
        }
    }
    public double deductFee(double sum){
        return sum*0.03;
    }
    public int getNumOfTransactions(){
        return this.numOfTransactions;
    }


}
