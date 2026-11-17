class NumberQ3 {
    public static void main(String[] args) {
        String s = "Hello";

        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}
