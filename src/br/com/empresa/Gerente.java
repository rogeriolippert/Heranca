package br.com.empresa;

public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionario;

	public Gerente(double salario, int senha,
			int numeroDeFuncionario) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionario = numeroDeFuncionario;
	}
}