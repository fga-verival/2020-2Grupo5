package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.CDB;

class TestRendimentoLiquido {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRendimentoLiquido1() {
		float valorInicial = 1000f;
		float taxaJuros = 0.085f;
		int qtdeDias = 60;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
		
		float rendimentoLiquido = cdb.getRendimentoLiquido();
		
		assertEquals(rendimentoLiquido, 1.0829f, 0.05);
	}
	
	@Test
	void testRendimentoLiquido2() {
		float valorInicial = 500f;
		float taxaJuros = 0.08f;
		int qtdeDias = 120;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
		
		float rendimentoLiquido = cdb.getRendimentoLiquido();
		
		assertEquals(rendimentoLiquido, 2.0384f, 0.05);
	}
	
	@Test
	void testRendimentoLiquido3() {
		float valorInicial = 3000f;
		float taxaJuros = 0.09f;
		int qtdeDias = 240;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
		
		float rendimentoLiquido = cdb.getRendimentoLiquido();
		
		assertEquals(rendimentoLiquido, 4.7342f, 0.05);
	}

}
