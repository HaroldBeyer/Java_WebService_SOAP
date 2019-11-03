package gerador_texto;

import javax.jws.WebService;

@WebService(endpointInterface = "gerador_texto.TextoServer")
public class TextoServerImpl implements TextoServer {

	public String criarIntrodução(String equipe, String tema) {
		// TODO Auto-generated method stub
		return "Nossa equipe  "+ equipe + " gostaria de apresentar o nosso trabalho de " + tema+ " da Universidade Católica do Salvador";
	}

	public String criarDesenvolvimento(String tema) {
		// TODO Auto-generated method stub
		return "Conforme apresentado nas últimas pesquisas do IBGE, " + tema+ " foi um dos temas mais discutidos nas últimas reportagens, sendo um tema bastante importante para o desenvolvimento de sofware devido a sua aplicabilidade em diversas áreas da Tecnologia da Informação, sendo assim imprescindível a discussão e inserção do mesmo no ambiente acadêmico.";
	}

	public String criarConclusão(String tema) {
		// TODO Auto-generated method stub
		return "Sendo assim, " + tema +  "é algo muito importante para a formação acadêmica e é algo que é sempre necessário se ter nas instituições de ensino superior";
	}

}
