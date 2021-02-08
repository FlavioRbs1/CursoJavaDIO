package Heranca_Polimorfismo;

public class Funcionarios {

	String nome;
	String matricula;
	String departmento;
	double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDepartmento() {
		return departmento;
	}
	public void setDepartmento(String departmento) {
		this.departmento = departmento;
	}
	public double getSalario() {
		return salario;
	}
	public double setSalario(double salario) {
		return this.salario = salario;
	}
	public double calculaImposto() {
		return getSalario() * 0.09;
	}


	
	
}
