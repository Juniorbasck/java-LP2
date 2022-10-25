package genericExemplo;

public class Main {
	public static void main(String[] args) {
		ImprimirInteiro impressaoI1 = new imprimirInteiro(777);
		impressaoI1.imprimir();
		
		
		ImprimirDouble impressaoD1 = new ImprimirDouble(777.77);
		impressaoD1.imprimir();
		
		ImprimirString impressaoS1= new imprimirString("IFSP");
		impressaoS1.imprimir();
		
		ImprimirGenerico<Integer> impressaoIG1 = new ImprimirGenerico<>(777);
		impressaoIG1.imprimir();
		
		
		ImprimirGenerico<Double> impressaoDG1 = new ImprimirGenerico<>(777.77);
		impressaoDG1.imprimir();
		
		ImprimirGenerico<String> impressaoSG1 = new ImprimirGenerico<>("IFSP");
		impressaoSG1.imprimir();
	}
}

	
	