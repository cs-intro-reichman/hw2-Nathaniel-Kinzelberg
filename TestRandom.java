public class TestRandom {
    public static void main(String[] args) {
        // Parse N from command line arguments
        int N = Integer.parseInt(args[0]);

        // Initialize counters for counts
        int countGreaterThan = 0;
        int countLessThanOrEqual = 0;

        // Generate random numbers and update counts
        for (int i = 0; i < N; i++) {
            double randomNumber = Math.random();
            if (randomNumber > 0.5) {
                countGreaterThan++;
            } else {
                countLessThanOrEqual++;
            }
        }

        // Display counts
        System.out.println("> 0.5: " + countGreaterThan + " times");
        System.out.println("<= 0.5: " + countLessThanOrEqual + " times");

        // Calculate and display ratio, handle edge case to avoid division by zero
        if (countLessThanOrEqual > 0) {
            double ratio = (double) countGreaterThan / countLessThanOrEqual;
            System.out.println("Ratio: " + ratio);
        } else {
            System.out.println("Ratio: Undefined (all values were > 0.5 or all values were <= 0.5)");
        }
    }
}
