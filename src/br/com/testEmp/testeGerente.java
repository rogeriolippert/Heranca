package br.com.testEmp;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.empresa.ControleDeBonificacoes;
import br.com.empresa.Funcionario;
import br.com.empresa.Gerente;

public class testeGerente {

	private Gerente gerente;

	@Test
	public void nomeGerente() {
		gerente = new Gerente("Luiz Gonzaga");
	}

	@Test
	public void bonificaçãoSalario(double salario){
		gerente = new Gerente(500, 0, 0);
		salario = salario * 0.15
		assertEquals(2300,0);
	}