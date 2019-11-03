package gerador_texto;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/*@WebMethod float soma(float num1, float num2);
  @WebMethod float subtracao(float num1, float num2);
  @WebMethod float multiplicacao(float num1, float num2);
  @WebMethod float divisao(float num1, float num2);*/

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface TextoServer {
	@WebMethod String criarIntrodução(String equipe, String tema);
	@WebMethod String criarDesenvolvimento(String tema);
	@WebMethod String criarConclusão(String tema);
}
