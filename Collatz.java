public class Collatz {
    public static void main(String[] args) {
        // Parse the maximum seed value and mode
        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        boolean verbose = mode.equals("v");
        boolean allReachedOne = true;

        for (int seed = 1; seed <= maxSeed; seed++) {
            int count = 0;
            int current = seed;

            if (verbose) {
                System.out.print(current + " ");
            }

            // Generate hailstone sequence for the current seed
            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;  // If even, divide by 2
                } else {
                    current = 3 * current + 1;  // If odd, multiply by 3 and add 1
                }
                count++;

                if (verbose) {
                    System.out.print(current + " ");
                }
            }

            // Print the step count in verbose mode
            if (verbose) {
                System.out.println("(" + (count + 1) + ")");
            }

            // Check if every sequence up to N has reached 1
            if (current != 1) {
                allReachedOne = false;
            }
        }

        // Summary line for concise mode or after verbose output
        System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
    }
}
