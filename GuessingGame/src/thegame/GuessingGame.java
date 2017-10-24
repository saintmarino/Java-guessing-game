package thegame;

import java.util.Scanner;

public class GuessingGame {

	public void startgame()
	{
		Player P1 = new Player();
		Player P2 = new Player();
		Player P3 = new Player();
		Scanner intscanner = new Scanner(System.in);
		Scanner strscanner = new Scanner(System.in);

		System.out.print("Please enter a number between 1 and 10: ");
		int number = intscanner.nextInt();

		System.out.print("Please enter name of Player 1: ");
		P1.name = "";
		P1.name += strscanner.nextLine();

		System.out.print("Please enter name of Player 2: ");
		P2.name = "";
		P2.name += strscanner.nextLine();

		System.out.print("Please enter name of Player 3: ");
		P3.name = "";
		P3.name += strscanner.nextLine();

		System.out.println("Number to guess is " + number);

		boolean P1isRight = false;
		boolean P2isRight = false;
		boolean P3isRight = false;

		while(true)
		{
			int guess1 = P1.guess();
			int guess2 = P2.guess();
			int guess3 = P3.guess();

			System.out.println(P1.name + " guessed " + guess1);
			System.out.println(P2.name + " guessed " + guess2);
			System.out.println(P3.name + " guessed " + guess3);

			if(guess1 == number)
			{
				P1isRight = true;
			}
			if(guess2 == number)
			{
				P2isRight = true;
			}
			if(guess3 == number)
			{
				P3isRight = true;
			}

			if(P1isRight || P2isRight || P3isRight)
			{
				System.out.println("We have winner(s)!!!");
				if(P1isRight)
					System.out.println(P1.name + " guessed it correctly.");
				if(P2isRight)
					System.out.println(P2.name + " guessed it correctly.");
				if(P3isRight)
					System.out.println(P3.name + " guessed it correctly.");
				System.out.println("Game is over.");
				intscanner.close();
				strscanner.close();
				break;
			}
			
			else
			{
				System.out.print("No correct guesses on this pass. Would you like to continue for another pass? (Y/N): ");
								
				while(true)
				{
					String choice = strscanner.next();
					if(choice.equals("N"))
					{
						System.out.println("Thank you. Terminating the game");
						intscanner.close();
						strscanner.close();
						System.exit(0);
					}
					else if(choice.equals("Y"))
					{
						System.out.println("Thank you. Making another pass....");
						break;
					}
					else
					{
						while((!(choice.equals("Y"))) && (!(choice.equals("N"))))
							{
							System.out.print("Invalid choice. Please select either Y or N: ");
							break;
							}
						
					}

				}
				
				
				
			}

		}
		

	}


}
