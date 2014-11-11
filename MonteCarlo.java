//Ryan Trad
//September 27, 2011
//MonteCarlo
//This program uses the Monte Carlo Method to find and estimate for the value pi

import java.applet.Applet;
import java.awt.*;

public class MonteCarlo extends Applet
{
	public static void main (String[] args )
//	public void paint (Graphics page)
	{
		//Declarations and Headings
		System.out.println("Starting...");
		double x, y;
		double distance;
		double inCircle = 0, outCircle = 0;
		double  pi, wholePi = 0, cumulativePi = 0;
		int i, jLoops = 10000;
//		page.setColor (Color.black);
//		page.fillArc(-500,0,1000,1000,0,90);

		//Outer loop to repeat inner loop
		for (int j = 1; j <= jLoops; j++)
		{
			//Inner loop to generate random numbers and display progress
			for (i = 1; i <= 100000000; i++)
			{
				x = Math.random();
				y = Math.random();
				distance = Math.sqrt((x*x)+(y*y));
				if (distance <= 1)
					inCircle += 1;
				outCircle += 1;

//				page.setColor(Color.red);
//				page.fillOval((int)(x*500),(int)(y*500),1,1);

				if (i==50000000)
					System.out.println("\t50%");
				if (i==25000000)
					System.out.println("\t25%");
				if (i==75000000)
					System.out.println("\t75%");
			}


			//Calculation for each individual j result for pi, then average j result for pi
			pi = 4*(inCircle/outCircle);
			cumulativePi += pi;
			wholePi = cumulativePi/j;
			System.out.println(j + ": " + wholePi);
		}
		//Results displayed
		System.out.println("Estimate for pi: "+wholePi);
//		page.setColor(Color.black);
//		page.drawString(("Estimate for pi: "+wholePi),0,515);
	}
}