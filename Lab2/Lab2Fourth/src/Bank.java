import java.util.Vector;
public class Bank {
    public Vector<Account> accounts;
    public Bank() {
        accounts = new Vector<Account>();
    }
    public void update(){
        for(int i=0; i<accounts.size(); i++){
            addAccount(accounts.elementAt(i));
            addAccount(accounts.elementAt(i) , 3);
            if(accounts.elementAt(i) instanceof SavingAccount s)
            {
                s.addInterest();
            }
            else if(accounts.elementAt(i) instanceof CheckingAccount c)
            {
                c.withdraw(c.deductFee(c.getBalance()));
            }
        }
    }
    public void addAccount(Account newAcc){
        accounts.add(newAcc);
    }
    public void addAccount(Account newAcc, int a){
        newAcc.deposit(a);
        accounts.add(newAcc);
    }
    public void deleteAccount(Account account){
        accounts.remove(account);
    }
    public Vector<Account> getAccounts()
    {
        return this.accounts;
    }

}
