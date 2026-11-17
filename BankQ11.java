import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount < 0)
                throw new IllegalArgumentException("Negative amount not allowed");

            if (amount > balance)
                throw new InsufficientBalanceException("Insufficient balance");

            System.out.println("Remaining balance: " + (balance - amount));
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid numbers");
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Bank transaction completed.");
        }
    }
}
