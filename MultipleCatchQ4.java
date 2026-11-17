import java.util.Scanner;

class MultipleCatchQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter two numbers: ");
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division: " + a / b);

            System.out.print("Enter index: ");
            int i = Integer.parseInt(sc.nextLine());

            System.out.println("Element: " + arr[i]);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        catch (NumberFormatException e) {
            System.out.println("Enter valid number");
        }
    }
}
