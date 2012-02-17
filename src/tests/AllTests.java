//************************************************************
//	This assignment written for SE 441-02
//************************************************************
//
//	$Id: $
//
//	$Date: $
//
//	Reason: <describe the purpose of this class>
//
//*************************************************************

/** $Author: $ */
/** $Revision: $ */

// specify the package

// system imports

// project includes
 
//==============================================================
package tests;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	GoogleGatewayTest.class
})
public class AllTests {
	GoogleGatewayTest test = new GoogleGatewayTest();
	
	public static Test suite() {
		TestSuite suite = new TestSuite("AllTests");
		suite.addTest(new TestSuite(GoogleGatewayTest.class));
		return suite;
		
	}
	
	public static void main( String args[] ) {
		TestResult result = junit.textui.TestRunner.run(suite());
		System.out.println( "Tests were successful: " + result.wasSuccessful() );
	}
}
