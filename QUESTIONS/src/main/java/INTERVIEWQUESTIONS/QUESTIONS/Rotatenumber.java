package INTERVIEWQUESTIONS.QUESTIONS;

public class Rotatenumber {
	
	public void Rotate() {
	for (int i = 0; i < 5; i++)
	{
	    for (int j = 0; j < 5; j++)
	    {
	        System.out.print (((i + j) % 5) + 1);
	    }
	    System.out.println ();
	}
	}

	public static void main(String[] args) {
		
		Rotatenumber r  = new Rotatenumber();
		r.Rotate();
	}

}
