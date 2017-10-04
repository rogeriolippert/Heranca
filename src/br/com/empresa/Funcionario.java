package br.com.empresa;

public class Funcionario {
	protected String nome;
	protected static String cpf;
	protected double salario;

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public double getBonificacao() {
	    return this.salario * 0.10;
	  }
	Gerente gerente = new Gerente();
	gerente.setSalario(5000.0);
	System.out.println(gerente.getBonificacao());
	}

}
