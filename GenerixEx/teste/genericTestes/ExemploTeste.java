package genericTestes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import genericExemplo.ImprimirInteiro;
import genericExemplo.imprimirGenericoCuringa;

class ExemploTeste {

	@Test
	void test01() {
		ImprimirInteiro impressaoI1 = new ImprimirInteiro(777);]
		impressaoI1.imprimir();
	}

	void test02() {
		ImprimirDouble impressaoD1 = new ImprimirDouble(777.77);
		impressaoD1.imprimir();
	}
	
	void test03() {
		ImprimirString impressaoS1 = new ImprimirString("IFSP");
		impressaoS1.imprimir();
	}
	
	void test04() {
		ImprimirGenerico<Integer> impressaoIG1 = new ImprimirGenerico(777);
		impressaoIG1.imprimir();
	}
	
	void test05() {
		ImprimirGenerico<Double> impressaoDG1 = new ImprimirGenerico(777.77);
		impressaoDG1.imprimir();
	}
	
	void test06() {
		ImprimirGenerico<String> impressaoSG1 = new ImprimirGenerico("IFSP");
		impressaoSG1.imprimir();
	}
	
	void test7() {
		ImprimirGenerico<Integer> inlist = new Arraylist("777");
		inlist.add(2022.10);
		imprimirGenericoCuringa.imprimir(inlist);
	}
	
	void test08() {
		ImprimirGenerico<Double> inlist = new Arraylist("777.77");
		inlist.add(2022.10);
		imprimirGenericoCuringa.imprimir(inlist);
	}
	
	void test09() {
		ImprimirGenerico<String> inlist = new Arraylist("IFSP");
		inlist.add(2022.10);
		imprimirGenericoCuringa.imprimir(inlist);
	}
	

}
