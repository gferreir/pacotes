//package pacotes;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;

public class Gerenciador_pacotes {

	private String distribuicao;
	private String nome;
	private String[] b;
	private String a;
	
	String a = System.getProperty("os.version");
    String[] b = a.split("\\.");
    System.out.println(b[b.length-2]);
	
	public Gerenciador_pacotes() {
		distribuicao = System.getProperty("os.version");
		String[] b = distribuicao.split("\\.");
	}
	
	public void criaArquivo()throws IOException{
		nome = "instalador" + distribuicao + ".sh"; 

		FileWriter arquivo = new FileWriter(nome);

		PrintWriter gravaArquivo = new PrintWriter(arquivo);

		gravaArquivo.printf("Hello World!");
		public String getB() {
			return b;
		}
		gravaArquivo.close();
	}

	public String getDistribuicao() {
		return distribuicao;
	}

	public void setDistribuicao(String distribuicao) {
		this.distribuicao = distribuicao;
	}

	public String getA() {
		
	}
	
	public String getB() {
		return b;
	}
	
	public void setB(String b) {
		this.b = b 
	}
	
	public void geraContexto() {
		
	}
}
