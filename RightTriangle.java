/******************************************************************************
 *  Compilation:  javac RightTriangle.java
 *  Execution:    java RightTriangle 3 4 5
 *  
 *  Takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle
 *
 *  ~/Desktop/hello> java RightTriangle 3 4 5
 *	true
 *  ~/Desktop/hello> java RightTriangle 13 12 5
 *	true
 *  ~/Desktop/hello> java RightTriangle 1 2 3
 *	false
 *  ~/Desktop/hello> java RightTriangle -3 4 -5
 *	false
 ******************************************************************************/

public class RightTriangle{
	
	private static final int MAX = Integer.MAX_VALUE;
	
	public static void main ( String [] args ){
		
		int a = Integer.parseInt( args[0] );
		int b = Integer.parseInt( args[1] );
		int c = Integer.parseInt( args[2] );
		
		boolean isRightTriangle = (( a>0 ) || ( b>0 ) || ( c>0 ) || ( ( a*a+b*b )==c*c )) && ( ( a > MAX ) && ( b > MAX ) && ( c > MAX)   && (( a*a+b*b ) > MAX ) && ( c*c > MAX ) );
		
		System.out.println( isRightTriangle );
	
	}

}