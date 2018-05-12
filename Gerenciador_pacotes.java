package pacotes;

public class Gerenciador_pacotes {
	
	private String destribuição;

	public String getDestribuição() {
		return destribuição;
	}

	public void setDestribuição(String destribuição) {
		this.destribuição = destribuição;
	}
	
	public void imprime() {
		System.out.println(destribuição);
	}
	
	public void recebe() {
		System.out.println("Entre com a distribuição linux: ");	
	}
}
