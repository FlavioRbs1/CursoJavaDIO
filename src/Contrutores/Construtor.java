package Contrutores;

public class Construtor {

	private String marca;
	private String modelo;
	private Integer ano;
	private String variante;

	public Construtor(String marca,String modelo,Integer ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.variante = variante;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getVariante() {
		return variante;
	}
	
	
	
}
