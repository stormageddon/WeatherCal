package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import network.GoogleGateway;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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

public class GoogleGatewayTest {
	
	@Test
	public void testGetWeatherData() {
		GoogleGateway gg = new GoogleGateway();
		Document doc = gg.getWeatherData("rochester");
		System.out.println( doc.getDocumentElement().getLastChild().getNodeName() );
		
		Element root = doc.getDocumentElement();
		
		assertTrue( root.getFirstChild().getNodeName().equals( "weather" ) );
		assertEquals( root.getElementsByTagName("forecast_conditions").getLength(), 4 );
		System.out.println( "value: " + root.getElementsByTagName("current_conditions").item(0).getChildNodes().item(1).getAttributes().getNamedItem("data").getNodeValue() );
		assertTrue( root.getElementsByTagName("current_conditions").item(0).getChildNodes().item(1).getAttributes().getNamedItem("data").getNodeValue().equals( "43" ) );

		System.out.println( "here" );
		assertTrue( root.getElementsByTagName("current_conditions").item(0).getChildNodes().item(1).getNodeName().equals( "temp_f" ) );
		
		System.out.println( "testGetWeatherData was successful" );
	}

}
