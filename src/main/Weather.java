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
package main;

public class Weather {

	private int currentTempF = -1000;
	private int currentTempC = -1000;
	private String currentCondition = null;
	
	public void setCurrentTempInFarenheit( String temp ) {
		currentTempF = Integer.parseInt( temp );
	}
	
	public void setCurrentTempInFarenheit( int temp ) {
		currentTempF = temp;
	}
	
	public int getCurrentTempInFarenheit() {
		return currentTempF;
	}
}
