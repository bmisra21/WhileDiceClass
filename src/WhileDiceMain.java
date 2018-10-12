
public class WhileDiceMain {

	public static void main(String[] args) 
	{
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

	}

}
