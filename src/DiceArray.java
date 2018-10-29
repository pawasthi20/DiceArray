/**
 * 
 * @author Parth Awasthi
 *
 */
public class DiceArray 
{
	public static void main(String[] args) 
	{
		//Creating 2 Dice Objects
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int roll1 = 0;
		int roll2 = 0;
		
		//Creating Array
		int count[]=new int[12];
		
		//Rolling Dice 1000 Times
		for(int i = 0; i < 1000; i++)
		{
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			int sum = roll1 + roll2;
			count[sum-1]++;
		}
		
		//Displaying How Many Times Each Value Has Been Rolled
		for(int i = 1; i < 12; i++)
		{
			System.out.println(i + 1 + " has been rolled " + count[i] + " times.");
		}
	
	}
}