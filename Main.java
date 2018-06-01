// package pacotes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Gerenciador_pacotes gPacotes = new Gerenciador_pacotes();
		
		try {
			gPacotes.criaArquivo();
		}catch(IOException ex) {
			System.out.println(ex);
		}
		
	}

}
