//package pacotes;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Gerenciador_pacotes {
	
	private String destribuicao;
	private String nome="/suedbonitinho/instalador"+destribucao+".sh";
	
	FileWriter arquivo = new FileWriter(nome);

	public void criaArquivo(){
		
	}

	public String getDestribuicao() {
		return destribuicao;
	}

	public void setDestribuicao(String destribuicao) {
		this.destribuicao = destribuicao;
	}
	
	public void imprime() {
		System.out.println(destribuicao);
	}
	
	public void recebe() {
		System.out.println("Entre com a distribuição linux: ");	
	}
}
