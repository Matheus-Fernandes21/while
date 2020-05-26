import java.util.Scanner;
public class while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero =1;
		int valor;
		int maior=0;
    
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("digite 15 numeros:");
	
	do {
		System.out.printf("%d:",numero);
		 valor = leitor.nextInt();
		 numero++;
	
	if(valor>maior)
		maior=valor;
	}
	
	while(numero<=15);
	System.out.println("O maior numero digitado e:"+maior);
	
	
	
	
	
	
	}

}
