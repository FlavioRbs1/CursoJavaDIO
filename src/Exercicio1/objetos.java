package Exercicio1;

public class objetos {

	public static void main(String[] args) {
		
		carro c1 = new carro();
		
		
		c1.marca = "Toyota";
		c1.modelo = "Corolla";
		c1.pessoa.add("André");
		c1.pessoa.add("Carlos");
		c1.pessoa.add("Carla");
		
		System.out.println("Marca do Carro: "+c1.marca);
		System.out.println("Modelo do carro: "+c1.modelo);
		System.out.println("Pessoas dentro do carro: "+c1.pessoa);


	}

}
