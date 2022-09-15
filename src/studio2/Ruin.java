package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		//Start amount
		Scanner strtAmnt = new Scanner(System.in);
		System.out.println("Enter start amount: ");
		double start = strtAmnt.nextDouble();
		
		//Win chance
		Scanner wnCh = new Scanner(System.in);
		System.out.println("Enter win chance: ");
		double winchance = wnCh.nextDouble();
		
		//Win limit, must be 10
		Scanner wnlm = new Scanner(System.in);
		System.out.println("Enter win limit: ");
		double winlimit = wnlm.nextDouble();
		
		Scanner numdays = new Scanner(System.in);
		System.out.println("Enter number of days: ");
		double numberofdays = numdays.nextDouble();
		
		int totalSimulations = 0;
		
	
		//START OF SIM
		for (totalSimulations = 0; totalSimulations <= numberofdays; totalSimulations ++);
		{
			double dailyAmount = start;
			int totalWins = 0;
			int totalLoss = 0;
			while (dailyAmount > 0 && dailyAmount < winlimit)
			{
			
				if(Math.random() < winchance)
				{
					dailyAmount ++;
					totalWins ++;
					System.out.println("Simulation " + totalSimulations + ": Success");
					
				}
				else
				{
					dailyAmount ++;
					totalLoss ++;
					System.out.println("Simulation " + totalSimulations + ": Lose");
				};
				if (start >= winlimit)
				{
					System.out.println("Simulation " + totalSimulations + ": Success");
				}
				if (start <= 0)
				{
					System.out.println("Simulation " + totalSimulations + ": Lose");
				} 
		}
		}
	}
}
		
	
