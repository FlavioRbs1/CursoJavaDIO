package Heranca_Polimorfismo;

public class Atendente extends Funcionarios{

	public double calculaImposto() {
		return getSalario()+(getSalario() * 0.05);
	}
}
