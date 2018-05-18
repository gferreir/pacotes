//package pacotes;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Gerenciador_pacotes {

	private String destribuicao;
	private String nome;

	public void criaArquivo()throws IOException{
		nome="instalador" + destribuicao + ".sh"; 

		FileWriter arquivo = new FileWriter(nome);

		PrintWriter gravaArquivo = new PrintWriter(arquivo);

		gravaArquivo.printf("Hello World!");
		
		gravaArquivo.close();
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
