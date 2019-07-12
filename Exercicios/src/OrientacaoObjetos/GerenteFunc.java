package OrientacaoObjetos;

public class GerenteFunc extends Funcionario{
	
	private String nomeUsuario, senha;
	private double salarioGerente = 1000;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSalarioGerente() {
		return salarioGerente;
	}

	public void setSalarioGerente(double salarioGerente) {
		this.salarioGerente = salarioGerente;
	}

	public double calculaBonificacao() {
		setBonifica(salarioGerente += getSalario() * 0.2);
		return getBonifica();  
	}
	
	public void consultaDado() {
		System.out.printf("\nNome: %s \nSalário: %.1f \nBonificação: %.1f \nNome Usuário: %s \nSenha: %s", 
				getNome(), getSalarioGerente(), getBonifica(), getNomeUsuario(), getSenha());
	}
}