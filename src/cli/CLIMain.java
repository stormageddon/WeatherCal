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
package cli;

import java.util.Scanner;

import main.Weather;
import network.Gateway;
import network.GoogleGateway;

import org.w3c.dom.Document;

public class CLIMain {

	Scanner scanner = null;
	Gateway gate = null;
	Weather currentWeather = null;
	
	public CLIMain() { }
	
	public void init() {
		scanner = new Scanner(System.in);
		
		//Default to a GoogleGateway for now
		gate = new GoogleGateway();
		
		currentWeather = new Weather();
		
		String requestedCity = getUserInput();
		execute(requestedCity);
	}
	
	public String getUserInput() {
		//TODO Sanitize scanner input
		
		System.out.println( "Enter a city: " );
		String city = scanner.nextLine();
		
		String[] cityComponents = city.split(" ");
		String cityAsURLParam = "";
		
		for( String str : cityComponents ) {
			System.out.println("CityComponents component: " + str);
		}
		
		if( cityComponents.length > 1 ) {
			for( int index = 0; index < cityComponents.length - 1; index++ ) {
				cityAsURLParam += cityComponents[index] + "$";
			}
			cityAsURLParam += cityComponents[cityComponents.length - 1];
			System.out.println(cityAsURLParam);
			return cityAsURLParam;
		}
		System.out.println( city );
		return city;
	}
	
	public void execute( String city ) {
		Document doc = gate.getWeatherData( city );
		currentWeather.setCurrentTempInFarenheit(doc.getDocumentElement().getElementsByTagName("current_conditions").item(0).getChildNodes().item(1).getAttributes().getNamedItem("data").getNodeValue());
		
		displayWeather();
	}
	
	public void displayWeather() {
		System.out.println( "The current temperature is " + currentWeather.getCurrentTempInFarenheit() );
	}
}
