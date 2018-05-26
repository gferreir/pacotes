//package pacotes;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;

public class Gerenciador_pacotes {

	private String distribuicao;
	private String nome;
	
	public Gerenciador_pacotes() {
		distribuicao = System.getProperty("os.version");
	}
	
	public void criaArquivo()throws IOException{
		nome="instalador" + distribuicao + ".sh"; 

		FileWriter arquivo = new FileWriter(nome);

		PrintWriter gravaArquivo = new PrintWriter(arquivo);

		gravaArquivo.printf("Hello World!");
		
		gravaArquivo.close();
	}

	public String getDistribuicao() {
		return distribuicao;
	}

	public void setDistribuicao(String distribuicao) {
		this.distribuicao = distribuicao;
	}

	public void imprime() {
		System.out.println(distribuicao);
	}
	
	public void geraContexto() {
		
	}
}
