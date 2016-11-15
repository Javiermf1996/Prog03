import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N,divisor=1,total = 0,suma=0;
		
		System.out.print("Inserte numero: ");
		N=teclado.nextInt();
		
		while(divisor<N){
			
				if(N%divisor==0){
				total = total + divisor;
				
				divisor++;
			}
				else
					divisor++;
		}
		
			if(total==N){
				System.out.println("El numero es perfecto");
			} else {
				System.out.println("El numero no es perfecto");
			}
	}
}
