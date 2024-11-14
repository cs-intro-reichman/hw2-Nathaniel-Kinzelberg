public class Collatz {
    public static void main(String[] args) {
		
		int firstNumber = Integer.parseInt(args[0]);
		int currentNumber = 0;

		for (int i = 1; i >= firstNumber; i++){
			
			currentNumber = i;
			System.out.print(currentNumber + " ");
			
			if(currentNumber == 1){			
				currentNumber = (currentNumber*3) + 1;			
					while(currentNumber != 1){		
						System.out.print(currentNumber + " ");
							if (currentNumber%2 == 0){
								currentNumber = currentNumber/2;
								System.out.print(currentNumber + " ");}}
			}else{
				if (currentNumber%2 == 0){
					currentNumber = currentNumber/2;
					System.out.print(currentNumber + " ");
				} else {
					currentNumber = (currentNumber*3) + 1;
					System.out.print(currentNumber + " ");
							}
					}
					System.out.print("Every one of the first " + firstNumber + " hailstone sequences reached 1.")
		}
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