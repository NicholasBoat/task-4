//Naoto Oka
//05/11/21
//TaskFour
import java.util.Scanner;
public class TaskFour {

	public static void main(String[] args)
	{
		
		final String [] countries = {"Canada", "China", "Germany", "Korea",
		 "Japan", "Russia", "United States"};
		final int medal = 3;
		final int [] [] medals =
			{
					{1,0,1},
					{1,1,0},
					{0,0,1},
					{1,0,0},
					{0,1,1},
					{0,1,1},
					{1,1,0}		
			};
				System.out.println("        Country    Gold  Silver  Bronze   Total");
				
				
				for(int i = 0; i < countries.length; i++)
				{
					System.out.printf("%15s",countries[i]);
					
				for(int j = 0; j < medal; j++)
				{
					System.out.printf("%8d",medals[i][j]);
					
				}
				totalMedals(medals);
				System.out.println();
				}
				
					
				
			}
	public static void totalMedals(int[] [] medals )
	{		
		for(int i = 0; i < medals.length; i++)
		{
		int total = 0;	
			
		for(int j = 0; j < medals[0].length; j++)
		{
			total = total + medals [i][j];
		
		}
		System.out.printf("%8d",total);
		}
	
	
	
	}
}	
	
	


