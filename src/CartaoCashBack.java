
public class CartaoCashBack extends CartaoPrePago{
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;

	}
	
	public boolean comprar(double valor) {
		if (valor <= this.saldo) {
			if(tipo == 1) {
				this.saldo -= (valor - valor*0.02);
				return true;	
			}
			else if(tipo == 2) {
				this.saldo -= (valor - valor*0.05);
				return true;	
			}
			else if(tipo == 3) {
				this.saldo -= (valor - valor*0.08);
				return true;	
			}
			else {
				System.out.println("tipo de cartao invalido. Entre em contato com nossa central");
				return false;
			}
			
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", anoValidade=" + anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + "]";
	}
	
	
}
