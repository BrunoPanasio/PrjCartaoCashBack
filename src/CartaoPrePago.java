
public class CartaoPrePago {
	protected String numeroCartao, nomeTitular;
	protected int anoValidade, mesValidade;
	protected double saldo;
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
		
	public void adicionarCredito(double valor) {
		saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "CartaoPrePago [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}
	
}
