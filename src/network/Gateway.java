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
package network;

import org.w3c.dom.Document;

public interface Gateway {
	
	public Document getWeatherData( String location );
}
