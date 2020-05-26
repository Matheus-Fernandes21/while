import java.util.Scanner;

public class while1 {

	public static void main(String[] args) 
	// TODO Auto-generated method stub

	{	
		    Scanner leitor = new Scanner(System.in); 
		        int valor;
		        int qntdnumeros = 1;  
		        
		        do {  
		           
		            System.out.println("numero:");
		             valor = leitor.nextInt();      
		           
		          
		          if(valor > 0){
		            System.out.println("numero positivo");
		           }
		          else{
		            System.out.println("numero negativo");
		           }
		          qntdnumeros++;
		        } while ( qntdnumeros < 11);
	
	}

}
