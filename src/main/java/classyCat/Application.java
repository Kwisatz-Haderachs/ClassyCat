package classyCat;

public class Application {
    public static void main(String[] args) {

        BankAccount bella = new BankAccount("Bella", "Flint");
        System.out.println(bella.getBalance());
        bella.deposit(100.00f);
        System.out.println(bella.getBalance());
        bella.withdrawl(50.004f);
        System.out.println(bella.getBalance());
        bella.withdrawl(50.004f);
        System.out.println(bella);
    }
}
