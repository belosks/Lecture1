/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye Katongole Mubarak
 *  
 *  Reads in two Names command-line arguments and prints "Hello Katongole and Mubarak" and "Goodbyu Katongole and Mubarak"
 *
 *  % java HelloGoodbye Katongole Mubarak
 ******************************************************************************/


public class HelloGoodbye {
	public static void main( String [] args ){
		 System.out.print( "Hello " );
		 System.out.print( args[0] );
		 System.out.print( " and " );
		 System.out.println( args[1] + "." );
		 System.out.print( "Goodbuy " );
		 System.out.print( args[1] );
		 System.out.print( " and " );
		 System.out.println( args[0] + "." );
	
	}
}
