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
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// project includes

//==============================================================

public class GoogleGateway implements Gateway {

	
	private final String URL_ADDRESS = "http://www.google.com/ig/api?weather=$";
	
	@Override
	public Document getWeatherData( String location ) {
		Document doc = null;
		
		try {
			
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            
            URL test = new URL( URL_ADDRESS + location);
			doc = docBuilder.parse((InputStream)test.getContent());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doc;
	}

}
