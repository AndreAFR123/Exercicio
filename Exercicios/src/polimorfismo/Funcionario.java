package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	
	private String nomeFunc;
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	Date agora = new Date();
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	
	public String entradaFunc() {
		String entrada;
		entrada = "Entrada: " + data.format(agora);
		return entrada;
	}
	
	public String saidaFunc() {
		String saida;
		saida = "Saida: " + data.format(agora);
		return saida;
	}
}
