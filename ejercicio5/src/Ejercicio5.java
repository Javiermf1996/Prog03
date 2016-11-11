import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int N=0, contador=0, acumulador=0;
		
		System.out.println("Introduce numero: ");
		N=teclado.nextInt();
		
		
		while (N!=0){
			acumulador=N+acumulador;
			contador++;
			System.out.println("Introduce numero: ");
			N=teclado.nextInt();
			
			
		}
		contador++;
		
		System.out.print("Resultado de la suma:"+ acumulador);
		System.out.print("Numeros introducidos:"+ contador);
	}
}

