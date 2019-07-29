package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task4;

public class Main {

    public static void main(String[] args) {
        BankClient client1 = new BankClient("Pupkin M.A.",
                new BankAccount(1000.5, BankAccount.AccountType.MAIN),
                new BankAccount(500, BankAccount.AccountType.ADDITIONAL),
                new BankAccount(-300, BankAccount.AccountType.OVERDRAFT)
                );

        client1.blocAccount(BankAccount.AccountType.OVERDRAFT, true);
        client1.blocAccount(BankAccount.AccountType.OVERDRAFT, false);

        client1.showBalance(BankAccount.AccountType.ADDITIONAL);
        client1.showBalance();
        client1.sortAccount();
        client1.amountPositiveAccounts();
        client1.amountAllAccounts();
    }
}
