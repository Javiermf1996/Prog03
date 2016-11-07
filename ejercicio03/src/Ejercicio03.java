import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N, divisor = 1,resultado = 0;
		
		System.out.print("Divisores de: ");
		N=teclado.nextInt();
		
		while (divisor < N){	
			if ( N % divisor == 0){
				
				
				System.out.println(divisor);
				
			}
			
			divisor++;		
		}
				
				
				
		
			 
	}
			
}


