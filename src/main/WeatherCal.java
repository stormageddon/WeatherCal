//************************************************************
//	This Project is a simple alarm clock that will change
//    the song played based on the weather outside. The
//    point of it is really for me to play around with
//    learning git better, as well as to experiment
//    with the Google Weather API.
//************************************************************

/** $Author: Michael Caputo */


// specify the package
package main;

// system imports
import gui.GUIMain;
import network.Gateway;
import network.GoogleGateway;
import cli.CLIMain;

// project includes

//==============================================================

public class WeatherCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Clean up help output
		String command = args[0];
		
		if( command.equals( "-gui" ) || command.equals( "-g" ) ) {
			GUIMain gui = new GUIMain();
		}
		else if( command.equals("-cli" ) || command.equals( "-c" ) ) {
			CLIMain cli = new CLIMain();
			cli.init();
		}
		else if( command.equals( "--help" ) || command.equals( "--h" ) ) {
			System.out.println( "To run gui interface, use -gui or -g. To run CLI, use -cli or -c." );
		}
		else {
			System.out.println( "Invalid arguments. Try --help for further information." );
		}
		Gateway googleGate = new GoogleGateway();
		googleGate.getWeatherData("rochester");
	}

}
