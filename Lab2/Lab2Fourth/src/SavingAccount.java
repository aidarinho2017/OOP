public class SavingAccount extends Account{
    public double interestRate=0.23;
    public SavingAccount(int a){
        super(a);
        interestRate = 0.09;
    }
    public void setInterestRate(double percent){
        interestRate = percent;
    }
    public void addInterest(){
        deposit(getBalance()*interestRate);
    }
    public double getInterestRate()
    {
        return this.interestRate;
    }
}
