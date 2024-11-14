public class Cheers {
        public static void main(String[] args) {
            // Check if the right arguments are provided
            if (args.length < 2) {
                System.out.println("Please provide a string and a non-negative integer.");
                return;
            }
    
            // Parse inputs
            String cheerWord = args[0].toUpperCase(); // Convert input string to uppercase
            int repeatCount = Integer.parseInt(args[1]); // Parse the repeat count
    
            // Letters that require "an" instead of "a"
            String anLetters = "AEFHILMNORSX";
    
            // Print each letter cheer line with appropriate "a" or "an"
            for (int i = 0; i < cheerWord.length(); i++) {
                char letter = cheerWord.charAt(i);
                String article = anLetters.indexOf(letter) >= 0 ? "an" : "a";
                System.out.println("Give me " + article + " " + letter + ": " + letter + "!");
            }
    
            // Print the final cheering lines
            System.out.println("What does that spell?");
            for (int i = 0; i < repeatCount; i++) {
                System.out.println(cheerWord + "!!!");
            }
        }
    }
    