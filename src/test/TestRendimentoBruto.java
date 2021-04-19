package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.CDB;

class TestRendimentoBruto {
	
	float valorInicial;
	float taxaJuros;
	int qtdeDias;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRendimentoBruto1() {
		valorInicial = 1000f;
		taxaJuros = 0.085f;
		qtdeDias = 60;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
		
		float rendimentoBruto = cdb.getRendimentoBruto();
		
		assertEquals(rendimentoBruto, 13.97f);
	}

}
