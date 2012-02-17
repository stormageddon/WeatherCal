//************************************************************
//	This Project is a simple alarm clock that will change
//    the song played based on the weather outside. The
//    point of it is really for me to play around with
//    learning git better, as well as to experiment
//    with the Google Weather API.
//************************************************************

/** $Author: Michael Caputo */


// specify the package
package network;

// system imports
import org.w3c.dom.Document;

// project includes

//==============================================================

public interface Gateway {
	
	public Document getWeatherData( String location );
}
