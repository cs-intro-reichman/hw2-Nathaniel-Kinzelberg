public class CalcPi {
    public static void main(String[] args) {

        // Parse the input argument for the number of terms
        int terms = Integer.parseInt(args[0]);

        // Display the value of pi according to Java's Math library
        System.out.println("pi according to Java: " + Math.PI);

        // Calculate π approximation using the Gregory-Leibniz series
        double piApproximation = 0.0;
        for (int i = 0; i < terms; i++) {
            // Each term is of the form: ± 1 / (2*i + 1)
            double term = 1.0 / (2 * i + 1);
            // Alternate signs for each term: + - + - ...
            if (i % 2 == 0) {
                piApproximation += term; // Add for even terms
            } else {
                piApproximation -= term; // Subtract for odd terms
            }
        }

        // Multiply the result by 4 to approximate π
        piApproximation *= 4;

        // Display the approximated value of π
        System.out.println("pi, approximated: " + piApproximation);    }
}
