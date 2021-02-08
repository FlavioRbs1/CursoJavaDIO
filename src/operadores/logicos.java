package operadores;

public class logicos {

	public static void main(String[] args) {


		final var numero = 2;
		final var letra = "A";
		
		//Short circuit
		if(numero < 5 && letra.equals("A")) {
			System.out.println("Atendeu a condição");
		}
		if (numero < 5 || letra.equals("A")) {
			System.out.println("Atendeu a outra condição");
		}
		if ((10 - 5)> 1 && (5 - 3) > 1) {
			System.out.println("Logica Maluca");
		}
		
	}

}
