package br.com.empresa;

public class Gerente extends Funcionario {
	int senha;
	int numeroDeFuncionario;

	public Gerente(double salario, int senha, int numeroDeFuncionario) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionario = numeroDeFuncionario;
		
		
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public double getBonificacao() {
		Gerente gerente = new Gerente();
		gerente.setSalario(5000.0);
		return super.getBonificacao() + 1000;
		System.out.println(gerente.getBonificacao());
	}
}
