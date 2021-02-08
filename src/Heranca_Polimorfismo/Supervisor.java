package Heranca_Polimorfismo;

public class Supervisor extends Funcionarios {
	
	public double calculaImposto() {
		return getSalario()+(getSalario() * 0.03);
	}
}
