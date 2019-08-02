package examples;

import javax.xml.ws.Endpoint;

public class SOAPPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8880/ws/myperson2", new PersonServiceImpl());  
	}

}
