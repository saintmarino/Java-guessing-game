package thegame;

public class Player {
	String name;
	int number;
	int guess()
	{
		number = (int) (Math.random()*10);
		return number;
	}

}
