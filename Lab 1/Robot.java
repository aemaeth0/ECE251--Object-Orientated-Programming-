import java.lang.Math;

public class Robot {
double x;
double y;
double d;
double theta;

	public Robot() {
		// TODO Auto-generated constructor stub
		x = 10;
		y = 69;
		theta = 180;
		d = 199;
	}

	void finalLocation()
	{
	x = x + d*Math.cos(theta*(Math.PI/180));
	y = y + d*Math.sin(theta*(Math.PI/180));
	System.out.println("New location of x and y: ("+ x + ","+ y+")");		
	}

	
}
