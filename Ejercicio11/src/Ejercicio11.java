import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N,P=1,contador=0, divisor=1;
		
		System.out.println("Introduzca el numero: ");
		N=teclado.nextInt();
		
		while (P<=N){
				contador=0;
				divisor=1;
		while (P>=divisor){
			if(P%divisor == 0)
				contador++;
				divisor++;
				}
			if(contador == 2 || contador == 1)
				
		System.out.println( P);
		P++;
		}	
	}
}