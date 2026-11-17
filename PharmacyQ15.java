import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String msg) {
        super(msg);
    }
}

class PharmacyQ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String name = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0)
                throw new InvalidQuantityException("Negative quantity not allowed");

            if (required > available)
                throw new InsufficientMedicineStockException("Insufficient stock");

            System.out.println("Medicine: " + name);
            System.out.println("Remaining quantity: " + (available - required));
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid quantity");
        }
        catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}
