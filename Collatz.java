public class Collatz {
    public static void main(String[] args) {
        // Parse the maximum seed value and mode
        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        boolean verbose = mode.equals("v");
        boolean allReachedOne = true;

        for (int seed = 1; seed <= maxSeed; seed++) {
            int count = 1;  // Start count at 1 since we already have the initial seed
            int current = seed;
            StringBuilder sequence = new StringBuilder();  // To hold the sequence of numbers

            // Add the first number (seed) to the sequence
            sequence.append(current);

            // Generate hailstone sequence for the current seed
            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;  // If even, divide by 2
                } else {
                    current = 3 * current + 1;  // If odd, multiply by 3 and add 1
                }
                count++;  // Increment the count for each step

                sequence.append(" ").append(current);  // Append the next number in the sequence
            }

            // Print the full sequence and the number of steps in verbose mode
            if (verbose) {
                System.out.println(sequence.toString() + " (" + count + ")");
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
