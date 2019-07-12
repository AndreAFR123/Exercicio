package OrientacaoObjetos;

public class CartaoCredito {
	private int num = 3;
	private int validade = 17062017;
	private int idCli;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public int getIdCli() {
		return idCli;
	}

	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	public CartaoCredito(int num) {
		this.num = num;
	}
}
