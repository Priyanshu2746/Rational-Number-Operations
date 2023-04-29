public class rational_no {
    public static void operations(int number1, int number2){
        // Declare variables for sum, subtract, product, and greater
        int sum = 0, subtract = 0, product = 0, greater = 0;

        // Compute sum, subtract, product, and greater using the given rational numbers
        sum = number1 + number2;
        subtract = number1 - number2;
        product = number1*number2;
        greater = Math.max(number1, number2);

        // Output the results to the console
        System.out.println("SUM : "+ sum);
        System.out.println("Subtract :"+subtract);
        System.out.println("Product :" + product);
        System.out.println("Greater number :"+greater);
    }

    public static void main(String []args) {
        try{
            // Parse the command line arguments and create two rational numbers
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int d = Integer.parseInt(args[3]);
            int number1 = a/b;
            int number2 = c/d;

            // Call the operations method to compute and output the results
            operations(number1, number2);
        } catch (ArithmeticException e) {
            // Handle the case where the input is not a valid rational number
            System.out.println("Please enter a and b in a form so that it is a rational number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where insufficient arguments are provided in the command line
            System.out.println("Please enter sufficient arguments in the command line");
        }
        catch (NumberFormatException e) {
            // Handle the case where non-numeric input is provided in the command line
            System.out.println("Please enter numbers");
        }
    }
}
