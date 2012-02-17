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

public class GoogleGateway implements Gateway {

	
	private final String address = "http://www.google.com/ig/api?weather=$";
	
	@Override
	public Document getWeatherData( String location ) {
		Document doc = null;
		
		try {
			
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            
            URL test = new URL( address + location);
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
