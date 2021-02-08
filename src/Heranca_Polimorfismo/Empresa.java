package Heranca_Polimorfismo;

public class Empresa {

	public static void main(String[] args) {

		Funcionarios gerente = new Gerente();
		Funcionarios supervisor = new Supervisor();
		Funcionarios atendente = new Atendente();
			
		gerente.setDepartmento("Qualidade");
		gerente.setMatricula("5432135313");
		gerente.setNome("Carlos");
		gerente.setSalario(1000);
		System.out.println("Nome: "+gerente.getNome());
		System.out.println("Departamento: "+gerente.getDepartmento());
		System.out.println("Matricula: "+gerente.getMatricula());
		System.out.println("Imposto de Salario: "+gerente.calculaImposto());
		System.out.println();
		
		supervisor.setDepartmento("Fiscal");
		supervisor.setMatricula("5432135863");
		supervisor.setNome("Paulo");
		supervisor.setSalario(5000);
		System.out.println("Nome: "+supervisor.getNome());
		System.out.println("Departamento: "+supervisor.getDepartmento());
		System.out.println("Matricula: "+supervisor.getMatricula());
		System.out.println("Imposto de Salario: "+supervisor.calculaImposto());
		System.out.println();
		
		atendente.setDepartmento("Logistica");
		atendente.setMatricula("5432136662");
		atendente.setNome("Julio");
		atendente.setSalario(2700);
		System.out.println("Nome: "+atendente.getNome());
		System.out.println("Departamento: "+atendente.getDepartmento());
		System.out.println("Matricula: "+atendente.getMatricula());
		System.out.println("Imposto de Salario: "+atendente.calculaImposto());
	}

}
