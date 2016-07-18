
public class NewtonRaphson {
	
	static double h1 = 500.0;
	static double h2 = 400.0;
	static double D = 200.0;
	static double deltaX = 0.0001;
	static double tolerance = 0.00000000001;
	
	public static void main(String[] args){
			
		double x = D/2;
		double current = f(x);
		double derivative = (f(x + deltaX) - f(x))/deltaX; 
	    double error = Math.abs(current);
		while(error > tolerance){
			
			x = x - (f(x)/derivative);
			System.out.println("x=" + x);
			derivative =  (f(x + deltaX) - f(x))/deltaX; 
			System.out.println("derivative=" + derivative);
			error = Math.abs(f(x));
			System.out.println("error=" + error);
		}
		
		System.out.println(x);		
	}

	static double f(double x){
		return (distance(x + deltaX) - distance(x))/deltaX;
	}

	static double distance(double x){
		return Math.sqrt(Math.pow(h1,2) + Math.pow(x, 2)) + 
				Math.sqrt(Math.pow(h2,2) + Math.pow(D-x, 2));
		
	}
	

}


