package gerador_texto;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import java.net.MalformedURLException;
import java.net.URL;

public class TextoClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		 URL url = new URL("http://127.0.0.1:9876/gerador_texto?wsdl");
		    QName qname = new QName("http://gerador_texto/","TextoServerImplService");
		    Service ws = Service.create(url, qname);
		    TextoServer txt = ws.getPort(TextoServer.class);
		    String equipe = "Os barris da arquitetura de software";
		    String tema = "Arquitetura de Software";
		    System.out.println("Introdução da equipe: "+equipe + txt.criarIntrodução(equipe, tema));
		    System.out.println("Desenvolvimento: "+ txt.criarDesenvolvimento(tema));
		    System.out.println("Conclusão: "+ txt.criarConclusão(tema));
	}

}
