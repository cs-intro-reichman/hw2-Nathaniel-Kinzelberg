public class Collatz {
    public static void main(String[] args) {
        
        int firstNumber = Integer.parseInt(args[0]);
        int currentNumber = 0;
        int nOn = 0; // Number of Numbers

        for (int i = 1; i <= firstNumber; i++) {
            
            currentNumber = i;
            System.out.print(currentNumber + " ");
            
            if (currentNumber == 1) { // Special case for when the number is 1

                    // When currentNumber reaches 1, print the final part
                    System.out.println("4 2 1 (4)");
                
				
            } else {
                // For all other numbers
                while (currentNumber != 1) {
                    if (currentNumber % 2 == 0) { // Check if even
                        currentNumber = currentNumber / 2; // Apply formula
                        System.out.print(currentNumber + " "); // Print number
                        nOn++;
                    } else { // If odd
                        currentNumber = (currentNumber * 3) + 1; // Apply formula
                        System.out.print(currentNumber + " "); // Print number
                        nOn++;
                    }
                }
                System.out.println("(" + (nOn + 1) + ")");
            }
            
            // Reset the counter for the next sequence
            nOn = 0;
        }  
        
        // Summary statement
        System.out.print("Every one of the first " + firstNumber + " hailstone sequences reached 1.");
    }
}

// 1 (1)
// 2 1 (2)
// 3 10 5 16 8 4 2 1 (8)
// 4 2 1 (3)
// 5 16 8 4 2 1 (6)
// 6 3 10 5 16 8 4 2 1 (9)
// 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)
// Every one of the first 7 hailstone sequences reached 1.