package dev.bestzige.bankaccount;

public class Main {
    public static void main(String[] args) {
        bankAccountTestCase();
    }

    private static void bankAccountTestCase() {
        Person person1 = new Person(111111111, "Best", "Zige");
        Person person2 = new Person(222222222, "Pair", "Zige");
        BankAccount ba = new BankAccount(person1, 2, 1000);
        System.out.println(ba);
        ba.addAccountOwner(person2.getIdCard(), person2.getFirstName(), person2.getLastName());
        System.out.println(ba);
        System.out.println(ba.getAccountId());
        System.out.println(ba.getBalance());
        System.out.println(ba.getAccountOwner()[0]);
        System.out.println(ba.getAccountOwner()[1]);
        ba.addAccountOwner(person2.getIdCard(), person2.getFirstName(), person2.getLastName());
        System.out.println(ba);
        System.out.println(ba.withdraw(100));
        System.out.println(ba);
        System.out.println(ba.deposit(100000));
        System.out.println(ba);
        BankAccount ba2 = new BankAccount(person2, 2, 1000);
        System.out.println(ba.transfer(ba2, 100000));
        System.out.println(ba);
        System.out.println(ba2);
    }
}
