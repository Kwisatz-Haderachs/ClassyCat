package classyCat;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        if(args.length == 0) {
            System.out.println("No arguments provided");
            caeserCipher();
        } else {
            try {
                //System.out.println("Try block reached");
                boolean c = check30(args);
                if (c == true) System.out.println("The input included the number 30");
                else System.out.println("The input did not include the number 30");

                int x = checkPositive(args);
                if (x >= 1) System.out.println("The input included some negative numbers or zero");
                else System.out.println("The input included only positive numbers");


            } catch (Exception e) {
                System.out.println("Error, mixed or invalid input received");
            }
        }
        BankAccount bella = new BankAccount("Bella", "Flint");
        System.out.println(bella.getBalance());
        bella.deposit(100.00f);
        System.out.println(bella.getBalance());
        bella.withdrawl(50.004f);
        System.out.println(bella.getBalance());
        bella.withdrawl(50.004f);
        System.out.println(bella);
    }

    public static boolean check30(String[] args){
        for (int i = 0; i < args.length; i++) {
            if(Integer.parseInt(args[i]) == 30){
                return true;
            }
        }
        return false;
    }

    public static int checkPositive(String[] args){
        int neg = 0;
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) <= 0) {
                neg++;
            }
        }
        if (neg >= 1) return neg;
        return 0;
    }

    public static void caeserCipher(){
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 20) + 1;
        System.out.println("Enter text to cipher: ");
        String s = sc.nextLine();
        Encrypt cipher = new Encrypt(s, rand);
        String ci = cipher.encryption();
        System.out.println(ci);
    }
}
