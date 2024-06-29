import java.util.Scanner;

public class CreditScoreGrade {

	static void space() {
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		// scanner
		Scanner scan = new Scanner(System.in);
		
		// declarations
		int creditScore = 0;
		int excellentCredit = 761;
		
		System.out.println("-------------==========-------------");
		System.out.println("//////// Credit Score Grade ////////");
		System.out.println("-------------==========-------------");
		space();
		
		// user input
		System.out.print("What's your credit score? ");
		creditScore = scan.nextInt();
		
		// points until A+ credit
		excellentCredit = excellentCredit - creditScore;
				
		// if statements
		if (creditScore >= 300 && creditScore <= 620) {
			System.out.println("\nCredit Grade: D");
			System.out.println("\nRange: BELOW AVERAGE / Average / Good / Excellent");
			System.out.println("\nYou are " + excellentCredit + " points away from having excellent credit!");
			System.out.println("\nDon't give up now... stay focused!");
		} 
		
		else if (creditScore >= 621 && creditScore <= 700) {
			System.out.println("\nCredit Grade: C");
			System.out.println("\nRange: Below Average / AVERAGE / Good / Excellent");
			System.out.println("\nYou are " + excellentCredit + " points away from having excellent credit!");
			System.out.println("\nIt's too late to turn back now... keep pushing!");
		}
		else if (creditScore >= 701 && creditScore <= 760) {
			System.out.println("\nCredit Grade: B");
			System.out.println("\nRange: Below Average / Average / GOOD / Excellent");
			System.out.println("\nYou are only " + excellentCredit + " points away from having excellent credit!");
			System.out.println("\nYou're almost there... keep going!");
		} 
		
		else if (creditScore >= 761 && creditScore <= 850) {
			System.out.println("\nCredit Grade: A+");
			System.out.println("\nRange: Below Average / Average / Good / EXCELLENT");
			System.out.println("\nGreat job!");
		}
		
		else {
			System.out.println("\nYou entered an invalid credit score.");
		}
		
		scan.close();

	}

}
