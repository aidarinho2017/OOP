public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new SavingAccount(1);
        Account acc2 = new SavingAccount(2);
        Account acc3 = new SavingAccount(3);
        Account acc4 = new SavingAccount(4);
        Account acc5 = new SavingAccount(5);
        acc1.deposit(50000);
        acc1.print();
        acc1.withdraw(200);
        acc1.print();
        acc2.deposit(50000);
        acc3.deposit(42000);
        acc4.deposit(46000);
        Bank bank1 = new Bank();
        bank1.addAccount(acc1);
        bank1.addAccount(acc2);
        bank1.addAccount(acc3);
        bank1.addAccount(acc4);
        bank1.update();
        CheckingAccount c1 = new CheckingAccount(1);
        CheckingAccount c2 = new CheckingAccount(2);
        CheckingAccount c3 = new CheckingAccount(3);
        CheckingAccount c4 = new CheckingAccount(4);
        bank1.addAccount(c1);
        bank1.addAccount(c2);
        bank1.addAccount(c3);
        bank1.addAccount(c4);
        c1.deposit(25000);
        c2.deposit(30000);
        acc1.transfer(20000, c1);
        c2.transfer(24000, acc2);
        System.out.println(bank1.getAccounts());





    }


}
