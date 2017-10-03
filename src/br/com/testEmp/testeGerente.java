package br.com.testEmp;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.empresa.Gerente;

public class testeGerente {

	private Gerente gerente;

	@Test
	public void nomeGerente() {
		gerente = new Gerente("Luiz Gonzaga", "6988574-00", 2000, 4555,233);
	}

	@Test
	public void bonificaçãoSalario(double salario){
		gerente = new Gerente();
		salario = salario * 0.15
		assertEquals(2300,0);
	}
}