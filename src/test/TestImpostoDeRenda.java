package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.CDB;

class TestImpostoDeRenda {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testImpostoDeRenda1() {
		float valorInicial = 1000f;
		float taxaJuros = 0.085f;
		int qtdeDias = 60;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
	
		float impostoDeRenda = cdb.getImpostoDeRenda();
		
		assertEquals(impostoDeRenda, 3.14f, 0.05);
	}
	
	@Test
	void testImpostoDeRenda2() {
		float valorInicial = 500f;
		float taxaJuros = 0.08f;
		int qtdeDias = 120;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
	
		float impostoDeRenda = cdb.getImpostoDeRenda();
		
		assertEquals(impostoDeRenda, 2.96f, 0.05);
	}
	
	@Test
	void testImpostoDeRenda3() {
		float valorInicial = 3000f;
		float taxaJuros = 0.09f;
		int qtdeDias = 240;
		
		CDB cdb = new CDB(valorInicial, taxaJuros, qtdeDias);
	
		float impostoDeRenda = cdb.getImpostoDeRenda();
		
		assertEquals(impostoDeRenda, 35.51f, 0.05);
	}

}
