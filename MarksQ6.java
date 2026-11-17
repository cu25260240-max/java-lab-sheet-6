import java.util.Scanner;

class MarksQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100)
                throw new Exception("Invalid marks");

            System.out.println("Valid marks: " + marks);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
