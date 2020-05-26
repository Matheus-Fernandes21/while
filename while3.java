import java.util.Scanner;
public class while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros = 1;
        int valor;
        int soma = 0 ,media;
		 
        Scanner leitor = new Scanner(System.in);
	        
	        System.out.println("Digite 20 numeros");
	        do {
	            System.out.printf("%dNumero:",numeros);
	            valor = leitor.nextInt();
	            ++numeros; 
	          soma = soma + valor;
	          media = soma/20;
	          
	        } while (numeros <= 20);
	         
	         System.out.println(soma);
	         System.out.println(media);
	        
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
