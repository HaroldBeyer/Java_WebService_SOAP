package gerador_texto;

import javax.xml.ws.Endpoint;

public class TextoServerPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://127.0.0.1:9876/gerador_texto",
				    new TextoServerImpl());

	}

}
