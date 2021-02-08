package Exercicio1;

import java.util.ArrayList;


public class carro {

	String marca;
	String modelo;
	ArrayList <String> pessoa = new ArrayList<>();
	

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public ArrayList<String> getpessoa() {
		return pessoa;
	}
	public void setpessoa(ArrayList<String> pessoa) {

		this.pessoa = pessoa;
	}


	
}
