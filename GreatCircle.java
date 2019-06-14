/******************************************************************************
 *  Compilation:  javac GreatCircle.java
 *  Execution:    java GreatCircle 3 4 5
 *  
 *  Programm takes four double command-line arguments x1, y1, x2, and y2—the latitude and longitude (in degrees)
 *  of two points on the surface of the earth—and prints the great-circle distance (in kilometers) between them
 *
 *  ~/Desktop/hello> java GreatCircle 40.35 74.65 48.87 -2.33    // Princeton to Paris
 *	5902.927099258561 kilometers
 *
 *	~/Desktop/hello> java GreatCircle 60.0 15.0 120.0 105.0      // for debugging
 *	4604.53989281927 kilometers
 ******************************************************************************/

pulic class GreatCircle {

	public static void main ( String [] args ) {
		
		double x1 = Double.parseDouble( args[0] );
		double y1 = Double.parseDouble( args[1] );
		double x2 = Double.parseDouble( args[2] );
		double y2 = Double.parseDouble( args[3] );
		
		float r = 6371.0; 
		
		double distance=2*r*Math.asin(Math.sqrt(Math.power(Math.sin((x2-x1)/2,2)+Math.cos(x1)*Math.cos(x2)*Math.sin((y2-y1)/2,2))));
		
		System.out.println(distance + " kilometers");
	}
}