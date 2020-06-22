
public class app {

	public static void main(String[] args) {
		CartaoPrePago c1,c2;
		c1 = new CartaoPrePago("1010 2020 3030 4040", "Bruno Pre", 2022, 04, 0);
		c2 = new CartaoCashBack("0101 0202 0303 0404", "Bruno Cashback", 2023, 05, 0, 3);
		
		System.out.println("Objetos iniciados:");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("");
		c1.adicionarCredito(500);
		c2.adicionarCredito(500);
		System.out.println("Objetos Creditados com 500 creditos:");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("");
		System.out.println("Compra de 500 creditos:");
		//compra do cartao pre pago		
		if (c1.comprar(500)) {
			System.out.println("Compra realizada pre pago");
			System.out.println(c1);
		}
		else {
			System.out.println("Compra não realizada pre pago");
		}
		//compra do cartao pre pago cashback
		if (c2.comprar(500)) {
			System.out.println("Compra realizada cashback");
			System.out.println(c2);
		}
		else {
			System.out.println("Compra não realizada cashback");
		}
		System.out.println("Compra de 600 creditos:");
		//compra do cartao pre pago		
		if (c1.comprar(600)) {
			System.out.println("Compra realizada pre pago");
			System.out.println(c1);
		}
		else {
			System.out.println("Compra não realizada pre pago");
		}
		//compra do cartao pre pago cashback
		if (c2.comprar(600)) {
			System.out.println("Compra realizada cashback");
			System.out.println(c2);
		}
		else {
			System.out.println("Compra não realizada cashback");
		}
		
		
	}

}
