package Heranca_Polimorfismo;

public class Gerente extends Funcionarios{

	public double calculaImposto() {
		return getSalario()+(getSalario() * 0.01);
	}
	
}
