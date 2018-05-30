//package pacotes;

public class Gerenc_pac_fedora{

	public Gerenc_pac_fedora() {
		super();
	}
	
	public String geraContextoFedora() {
		String var;
		
		var = "#!/bin/bash \n";
		var += "sudo dnf install docker -y\n";
		var += "sudo systemctl start docker\n";
		var += "sudo docker run hello-world\n";
		
		return var;
	}

}
