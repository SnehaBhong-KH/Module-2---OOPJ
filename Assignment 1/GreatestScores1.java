import java.util.Scanner;

class GreatestScores1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the score of first mock test: ");
		int score1 = sc.nextInt();
		System.out.print("Enter the score of second mock test: ");
		int score2 = sc.nextInt();
		
		if(score1 > score2){
			System.out.println("Test 1 has higher score.");
		}
		else{
			System.out.println("Test 2 has higher score");
		}
	}
}