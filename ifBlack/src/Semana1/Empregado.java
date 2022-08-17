package Semana1;

public class Empregado {
	//Declarar atributos
	
	private String nome;
	private double salario;
	
	//Construtor
	public Empregado(String nome, double salario) {
		
		this.nome = nome;
		this.salario = salario;
	}
	//Getters e setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//metodos do negocio
	
	public String exibir() {
		return this.nome + " R$ " + this.salario;
	}
	
	public void aumentarSalario(double percentual) {
		this.salario+= this.salario * percentual / 100;
		
	}
	
	
	
	
}
