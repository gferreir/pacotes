// package pacotes;

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
		String[] b = distribuicao.split("\\.");
		distribuicao = (b[b.length-2]);
	}
	
	public String geraContexto() {
		
		switch(distribuicao) {
		
			case "fc26":
			case "fc27":
			case "fc28":
				Gerenc_pac_fedora fedora = new Gerenc_pac_fedora();
				return fedora.geraContextoFedora();
		}
		return null;
	}
	
	public void criaArquivo()throws IOException{
		nome = "instalador-" + distribuicao + ".sh"; 

		FileWriter arquivo = new FileWriter(nome);

		PrintWriter gravaArquivo = new PrintWriter(arquivo);
		
		gravaArquivo.printf(geraContexto());
		
		Runtime.getRuntime().exec("chmod u+x " + nome);
		
		gravaArquivo.close();
		arquivo.close();
	}

	public String getDistribuicao() {
		return distribuicao;
	}

	public void setDistribuicao(String distribuicao) {
		this.distribuicao = distribuicao;
	}
	
}
