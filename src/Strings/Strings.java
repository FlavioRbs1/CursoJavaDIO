package Strings;

public class Strings {

	public static void main(String[] args) {
		
		var nome = "André";
		var sobreNome = "Gomes";
		var string = new String(" Minha String");
		final var nomecompleto = nome + sobreNome;
		System.out.println(nome);
		
		System.out.println("Char na posição: " + string.charAt(3));
		System.out.println("Quantidade=" + string.length());
		System.out.println("Sem Trim ["+string+"]");
		System.out.println("Com Trim ["+string.trim()+"]");
		System.out.println("Lower "+ string.toLowerCase());
		System.out.println("Upper "+ string.toUpperCase());
		System.out.println("Contém M? "+ string.contains("M"));
		System.out.println("Contém X? "+ string.contains("X"));
		System.out.println("Replace " + string.replace("n","#"));
		System.out.println("EqualsIgnoreCase? "+ string.equalsIgnoreCase("minha sTring"));
		System.out.println("Substring(1,6)="+string.substring(1,9));
	}

}
