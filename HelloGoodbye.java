/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye Kevin Bob
 *  
 *  Reads in two Names command-line arguments and prints "Hello Kevin and Bob" and "Goodbyu Kevin and Bob"
 *
 *  % java HelloGoodbye Kevin Bob
 ******************************************************************************/


public class HelloGoodbye {
	public static void main( String [] args ){
		 System.out.print( "Hello " );
		 System.out.print( args[0] );
		 System.out.print( " and " );
		 System.out.println( args[1] + "." );
		 System.out.print( "Goodbye " );
		 System.out.print( args[1] );
		 System.out.print( " and " );
		 System.out.println( args[0] + "." );
	
	}
}
