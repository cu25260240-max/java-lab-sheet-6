import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String msg) {
        super(msg);
    }
}

class DosageQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            int dosage = Integer.parseInt(sc.nextLine());

            if (dosage <= 0 || dosage > 1000)
                throw new InvalidDosageException("Invalid dosage");

            System.out.println("Patient: " + name);
            System.out.println("Drug: " + drug);
            System.out.println("Dosage: " + dosage + " mg");
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid dosage");
        }
        catch (InvalidDosageException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Dosage validation completed.");
        }
    }
}
