package Contrutores;

import javax.swing.JOptionPane;

public class instancia {

	public static void main(String[] args) {

		Construtor contrutor = new Construtor("Fiat","Uno",2019);

		String variante = contrutor.getVariante();
		variante = JOptionPane.showInputDialog("Insira uma variante");
		System.out.println("Marca: "+contrutor.getMarca());
		System.out.println("Modelo: "+contrutor.getModelo());
		System.out.println("A Variante é: "+ variante);
	}

}
