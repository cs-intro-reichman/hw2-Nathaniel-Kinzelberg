public class Collatz {
    public static void main(String[] args) {
		
		int firstNumber = Integer.parseInt(args[0]);
		int currentNumber = 0;
		int nOn = 0; // Number Of Numbers

		for (int i = 1; i <= firstNumber; i++){
			
			currentNumber = i;
			System.out.print(currentNumber + " ");
			
			if(currentNumber == 1){			// checks only the first 1 and creates a specific outcome
				currentNumber = (currentNumber*3) + 1;			
					while(currentNumber != 1){		
						System.out.print(currentNumber + " ");
							if (currentNumber%2 == 0){
								currentNumber = currentNumber/2;
								System.out.print(currentNumber + " ");
								nOn++;
							}
							System.out.println("(" + nOn + ")");	
							}
			}else{							// for all other cases
				if (currentNumber%2 == 0){	//find if even
					currentNumber = currentNumber/2; //proceeds with formula
					System.out.print(currentNumber + " "); //prints number
					nOn++;
				} else {									//if odd
					currentNumber = (currentNumber*3) + 1; //proceeds with formula	
					System.out.print(currentNumber + " "); //prints number
					nOn++;
							}
					}
					System.out.println("(" + nOn + ")");
					nOn = 0;
					} 			
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