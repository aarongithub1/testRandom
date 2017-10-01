package testCalculator;

public class randomNumber {
	public static void main(String[] args) {
		int[] randomNumber = new int[10];
		
		for (int row = 0; row < randomNumber.length; row++) {
			//if (randomNumber[row] == )
			randomNumber[row] = 1 + (int)(Math.random()*10);
			System.out.println(randomNumber[row]);
		}
		
	}
}