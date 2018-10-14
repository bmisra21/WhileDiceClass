import java.util.Scanner;

public class WhileDiceMain {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		WhileDice dice1 = new WhileDice();
		WhileDice dice2 = new WhileDice();
		
		int numRolls = 0;
		int  roll1=1;
		int roll2=2;
		
		while (roll1 != roll2 )
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			++numRolls;
		}
		System.out.println("Roll val:  " + roll1 + "\nSum of Rolls: " + (roll1 + roll2) + "\nNum rolls taken: " + numRolls);

		int targetVal=0;
		int counter = 0;
		int sum=0;
		while (targetVal < 2 || targetVal >12) 
		{
			System.out.print("Enter a number between 2 and 12: ");
			targetVal = in.nextInt();
			
		}
		while (sum != targetVal) 
		{
			int dice1Val = dice1.roll();
			int dice2Val = dice2.roll();
			sum = dice1Val + dice2Val;
			++counter;
			System.out.println(dice1Val + "+" + dice2Val + "=" + sum);
		}
		System.out.println("Rolls taken to get value: " + counter);
		
	}

}
