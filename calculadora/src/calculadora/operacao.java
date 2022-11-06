package calculadora;
import java.util.Scanner;

public class operacao extends templateMethod{
	
	Scanner ler = new Scanner(System.in)
	
	public void lerDados(){
		System.out.printf("informe seu peso");
		peso = ler.nextFloat();
		
		System.out.printf("informe seu peso");
		altura = ler.nextFloat();
		
		System.out.printf("informe seu peso");
		idade = ler.nextInt();
		
		System.out.prinf("\resultado:\n");
	}
			
		
}
